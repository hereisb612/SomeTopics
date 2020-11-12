package A.A15;

import java.util.Scanner;

public class 特别数的和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (s.contains("2") || s.contains("0") || s.contains("1") || s.contains("9")) {
                ans += i;
            }
        }

        System.out.println(ans);
    }
}
