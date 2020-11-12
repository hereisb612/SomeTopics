package B.B2;

import java.util.Scanner;
import java.util.TreeSet;

public class 寂寞的数 {
    static TreeSet<Integer> set = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            f(i);
        }

        for (int i = 1; i <= 40; i++) {
            boolean b = true;
            for (Integer integer : set) {
                if (i == integer) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(i);
            }

        }


    }

    public static void f(int i) {
        while (i <= 40) {
            char[] c = String.valueOf(i).toCharArray();
            for (int j = 0; j < c.length; j++) {
                i += c[j] - '0';
            }
            set.add(i);
        }
    }
}
