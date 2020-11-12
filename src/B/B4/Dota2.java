package B.B4;

import java.util.ArrayList;
import java.util.Scanner;

public class Dota2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        for (char c1 : c) {
            arr.add(c1);
        }

        while (!hasWinner(arr)) {
            for (int i = 0; i < arr.size(); i++) {
                int temp = i + 1;
                if (temp >= arr.size()) {
                    temp = 0;
                }
                for (int j = temp; j < arr.size(); j++) {
                    if (arr.get(i) != arr.get(j)) {
                        arr.remove(j);
                        break;
                    }
                }
            }
        }

        if (arr.get(0) == 'R') {
            System.out.println("Radiant");
        } else {
            System.out.println("Dire");
        }
    }

    public static boolean hasWinner(ArrayList<Character> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
