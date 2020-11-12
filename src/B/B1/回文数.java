package B.B1;

import java.util.Scanner;

public class 回文数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String M = sc.next();

        int count = 0;

        while (true) {
            if (count >= 30) {
                System.out.println("Impossible!");
                break;
            }

            M = add(M, N);
            count++;

            if (isNot(M)) {
                System.out.println("STEP=" + count);
                break;
            }

        }

    }

    public static String add(String a, int N) {
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();

        int c = Integer.parseInt(a, N);
        int d = Integer.parseInt(String.valueOf(sb), N);

        return Integer.toString((d + c), N);
    }

    public static boolean isNot(String a) {
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        return a.contentEquals(sb);
    }
}