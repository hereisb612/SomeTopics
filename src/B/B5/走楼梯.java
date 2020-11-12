package B.B5;

import java.util.Scanner;

public class 走楼梯 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(1, n));
    }

    public static int f(int now, int n) {
        if (now == n) {
            return 1;
        }

        if (now > n) {
            return 0;
        }

        return f(now + 1, n) + f(now + 2, n);
    }
}
