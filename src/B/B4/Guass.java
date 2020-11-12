package B.B4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Guass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            find(i, arr);
        }

        String s = output(arr);
        System.out.println(s.substring(1));
    }

    private static String output(ArrayList<Integer> arr) {
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>(arr);

        for (Integer s : set) {
            int count = 0;
            for (Integer a : arr) {
                if (s.equals(a)) {
                    count++;
                }
            }

            if (count == 1) {
                sb.append("*").append(s);
            }
            if (count > 1) {
                sb.append("*").append(s).append("(").append(count).append(")");
            }
        }


        return sb.toString();
    }

    private static void find(int n, ArrayList<Integer> arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                temp.add(j);
            }
            if (j * j == n) {
                temp.add(j);
            }
        }

        for (Integer integer : temp) {
            boolean b = true;
            for (int i = 2; i < integer; i++) {
                if (integer % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                if (integer != 1) {
                    arr.add(integer);
                }
            }
        }
    }
}
