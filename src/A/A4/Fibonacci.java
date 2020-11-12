package A.A4;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(f(22) % 10007);
    }

    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }
}
