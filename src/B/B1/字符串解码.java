package B.B1;

import java.util.Scanner;

public class 字符串解码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int end = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ']') {
                end = i;
            }

            if (s.charAt(i) == '[') {
                int n = s.charAt(i - 1) - '0';

                StringBuilder sb = new StringBuilder(s);

                String temp = "";

                System.out.println(i);
                System.out.println(end);

                for (int j = 0; j < n; j++) {
                    temp += sb.substring(i + 1, end);
                }

                sb.replace(i - 1, end + 1, temp);
                s = sb.toString();

                i = s.length();
            }
        }


        System.out.println(s);
    }
}
