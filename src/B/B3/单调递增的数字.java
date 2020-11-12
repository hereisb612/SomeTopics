package B.B3;

import java.util.Scanner;

public class 单调递增的数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 9) {
            System.out.println(n);
        } else {
            while (true) {
                boolean flag = true;
                char[] c = String.valueOf(n).toCharArray();
                for (int i = 1; i < c.length; i++) {
                    if (c[i] < c[i - 1]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(n);
                    break;
                } else {
                    n--;
                }
            }
        }
    }
}
