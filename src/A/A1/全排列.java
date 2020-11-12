package A.A1;

import java.util.Arrays;

public class 全排列 {
    static int[] arr = {1, 2, 3};

    public static void main(String[] args) {
        f(0, arr.length - 1);
    }

    public static void f(int start, int end) {
        if (start == end) {
            System.out.println(Arrays.toString(arr));
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
