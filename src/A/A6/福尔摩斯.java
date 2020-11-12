package A.A6;

public class 福尔摩斯 {
    static int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        f(0, arr.length - 1);
    }

    public static void f(int start, int end) {
        if (start == end) {

            if (arr[0] == 0) {
                return;
            }

            int left = arr[0] * 10000 + arr[1] * 1000 + arr[2] * 100 + arr[3] * 10 + arr[4];
            int right = arr[4] * 10000 + arr[3] * 1000 + arr[2] * 100 + arr[1] * 10 + arr[0];

            for (int i = 1; i <= 9; i++) {
                if (left * i == right) {
                    System.out.println(left + " * " + i + " = " + right);
                    System.exit(0);
                }
            }
            return;
        }

        for (int i = start; i <= end; i++) {
            int temp;

            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;

            f(start + 1, end);

            arr[i] = arr[start];
            arr[start] = temp;
        }
    }
}
