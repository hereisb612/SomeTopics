package B.B2;

import java.util.Scanner;

public class 字符串编辑 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String order = sc.next();

        if (order.equals("D")) {
            String a = sc.next();
            int index = input.indexOf(a);
            if (index != -1) {
                System.out.println(input.substring(0, index) + input.substring(index + 1));
            } else {
                System.out.println("cant");
            }
        }

        if (order.equals("I")) {
            String a1 = sc.next();
            String a2 = sc.next();
            int index = input.lastIndexOf(a1);
            if (index != -1) {
                System.out.println(input.substring(0, index) + a2 + input.substring(index));
            } else {
                System.out.println("cant");
            }
        }

        if (order.equals("R")) {
            String a1 = sc.next();
            String a2 = sc.next();
            int index = input.indexOf(a1);
            if (index != -1) {
                System.out.println(input.replaceAll(a1, a2));
            } else {
                System.out.println("cant");
            }
        }
    }
}
