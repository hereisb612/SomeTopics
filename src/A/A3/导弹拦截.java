package A.A3;

import java.util.ArrayList;
import java.util.Scanner;

public class 导弹拦截 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int count = 0;
        int height = 0;

        while (!arr.isEmpty()) {

            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) != -1) {
                    height = arr.get(i);
                    arr.set(i, -1);
                    break;
                }
            }

            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) != -1) {
                    if (height > arr.get(i)) {
                        height = arr.get(i);
                        arr.set(i, -1);
                    }
                }
            }

            count++;

            ArrayList<Integer> temp = new ArrayList<>();

            for (Integer integer : arr) {
                if (integer != -1) {
                    temp.add(integer);
                }
            }

            arr.clear();

            arr.addAll(temp);

            System.out.println(count + " / " + arr);
        }

    }
}