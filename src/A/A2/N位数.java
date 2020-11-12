package A.A2;

import java.util.Scanner;

public class N位数 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int N = sc.nextInt();

            int ans = 0;

            int start = (int) Math.pow(10, N - 1);
            int end = (int) Math.pow(10, N);

            for (int i = start; i < end; i++) {
                int count = 0;

                char[] arr = f(i + "");

                for (char c : arr) {
                    if (c - '0' == 3) {
                        count++;
                    }
                }

                if (count % 2 == 0) {
                    ans++;
                }

            }

            System.out.println(ans % 12345);
        }
    }

    public static char[] f(String n) {
        return n.toCharArray();
    }
}
