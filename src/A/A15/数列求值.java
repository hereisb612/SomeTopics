package A.A15;

public class 数列求值 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int temp = 0;

        for (int i = 4; i <= 20190324; i++) {
            temp = (a + b + c) % 10000;
            a = b;
            b = c;
            c = temp;
        }

        System.out.println(temp);

    }
}
