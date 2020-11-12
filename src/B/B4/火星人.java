package B.B4;

import java.util.Arrays;
import java.util.Scanner;

public class 火星人 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        while (M > 0) {
            arr[arr.length - 1]++;
            UP(arr, N);
            if (!hasMore(arr)) {
                M--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static boolean hasMore(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void UP(int[] arr, int n) {
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > n) {
                    arr[i] -= n;
                    arr[i - 1]++;
                }
            }

            boolean b = true;
            for (int i : arr) {
                if (i > n) {
                    b = false;
                    break;
                }
            }

            if (b) {
                return;
            }
        }
    }
}
