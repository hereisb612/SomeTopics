package A.A13;

public class 七星填数 {
    static int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10, 12, 13};

    public static void main(String[] args) {
        f(0, arr.length - 1);
    }

    public static void f(int start, int end) {
        if (start == end) {
            int a = 6 + arr[1] + arr[4] + 14;
            int b = arr[0] + arr[4] + arr[5] + arr[6];
            int c = 6 + arr[2] + arr[10] + 11;
            int d = arr[0] + arr[1] + arr[2] + arr[3];
            int e = arr[3] + arr[10] + arr[8] + arr[9];
            int f = 14 + arr[5] + arr[7] + arr[9];
            int g = arr[6] + arr[7] + arr[8] + 11;

            if (a == b && b == c && c == d && d == e && e == f && f == g) {
                System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
                return;
            }

            return;
        }


        for (int i = start; i <= end; i++) {
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;

            f(start + 1, end);

            arr[i] = arr[start];
            arr[start] = temp;
        }
    }
}
