package B.B4;

import java.util.Scanner;

public class 药瓶 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(f(sc.nextDouble(), 0));
        }
    }

    public static int f(double n, double b) {
        int sum = 0;

        if (n == 0) {
            return 1;
        }

        if (n < 0 || b < 0) {
            return 0;
        }

        if (b > 0) {
            sum += f(n - 1, b + 0.5);
            sum += f(n, b - 0.5);
        } else {
            sum += f(n - 1, b + 0.5);
        }

        return sum;
    }
}
