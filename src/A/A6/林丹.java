package A.A6;

import java.util.Scanner;

public class 林丹 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        while (true) {
            int n = sc.nextInt();
            if (n == 0) a++;
            if (n == 1) b++;

            if (a >= 21 && a - b >= 1) {
                System.out.println(0);
                break;
            }

            if (b >= 21 && b - a >= 1) {
                System.out.println(1);
                break;
            }
        }

    }
}
