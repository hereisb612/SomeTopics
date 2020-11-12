package A.A4;

import java.util.Scanner;

public class 进制相邻 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int L = sc.nextInt();
        int ans = 0;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {

            boolean b = true;

            String n = Integer.toString(i, K);

            if (n.length() > L) break;

            if (n.length() == L) {

                for (int j = 1; j < n.length(); j++) {
                    int t = (n.charAt(j - 1) - '0') - (n.charAt(j) - '0');
                    if (t == 1 || t == -1) {
                        b = false;
                        break;
                    }
                }

                if (b) {
                    ans = (ans + 1) % 1000000007;
                }

            }
        }

        System.out.println(ans);
    }
}
