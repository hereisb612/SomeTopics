package B.B5;

import java.util.Scanner;

public class 寻找最近的回文数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(find(n));
    }

    public static int find(int n) {
        int temp = n;
        while (true) {
            n--;
            if (isNot(n)) return n;

            temp++;
            if (isNot(temp)) return temp;
        }
    }

    public static boolean isNot(int n) {
        String s1 = String.valueOf(n);
        StringBuilder s2 = new StringBuilder(n + "");
        s2.reverse();
        return s1.equals(s2.toString());
    }
}
