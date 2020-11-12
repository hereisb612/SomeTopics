package A.A9;

public class 随意组合 {
    static int count = 0;
    static int[] A = {2, 3, 5, 8};
    static int[] B = {1, 4, 6, 7};

    public static void main(String[] args) {
        f(0, B.length - 1);
        System.out.println(count);
    }

    public static void f(int start, int end) {
        if (start == end) {
            int a = A[0] * 10 + B[0];
            int b = A[1] * 10 + B[1];
            int c = A[2] * 10 + B[2];
            int d = A[3] * 10 + B[3];

            int h = A[0] + B[0] * 10;
            int i = A[1] + B[1] * 10;
            int j = A[2] + B[2] * 10;
            int k = A[3] + B[3] * 10;

            if (a * a + b * b + c * c + d * d == h * h + i * i + j * j + k * k) {
                count++;
            }
            return;
        }

        for (int i = start; i <= end; i++) {
            int temp = B[start];
            B[start] = B[i];
            B[i] = temp;

            f(start + 1, end);

            B[i] = B[start];
            B[start] = temp;
        }
    }
}
