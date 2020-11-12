package A.A7;

import java.util.Scanner;

public class 二元函数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String f = sc.next();

        while (true) {
            int start = f.lastIndexOf("f");
            if (start != -1) {
                int end = f.indexOf(")", start);
                String s = f.substring(start + 2, end);
                String[] xy = s.split(",");
                int temp = (Integer.parseInt(xy[0]) * a) + (Integer.parseInt(xy[1]) * b);
                StringBuffer sb = new StringBuffer(f);
                sb.replace(start, end + 1, String.valueOf(temp));
                f = sb.toString();
            } else {
                break;
            }
        }

        System.out.println(f);

    }
}


