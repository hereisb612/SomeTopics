package B.B1;

import java.util.Scanner;

public class 超级玛丽 {
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] boom = new int[m];

        for (int i = 0; i < m; i++) {
            boom[i] = sc.nextInt();
        }

        f(1, n, boom);
        System.out.println(ans);
    }

    public static void f(int now, int end, int[] boom) {
        if (now == end) {
            ans++;
            return;
        }

        if (now > end) {
            return;
        }

        for (int value : boom) {
            if (value == now) {
                return;
            }
        }

        f(now + 1, end, boom);
        f(now + 2, end, boom);
    }
}
