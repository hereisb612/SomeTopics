package A.A2;

import java.util.Scanner;

public class 信封 {

    static int ans = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] target = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            target[i] = i + 1;
        }

        f(0, target.length - 1, arr, target);

        System.out.println(ans);
    }

    public static void f(int start, int end, int[] arr, int[] target) {
        if (start == end) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target[i]) {
                    return;
                }
            }
            ans++;
            return;
        }

        for (int i = start; i <= end; i++) {
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;

            f(start + 1, end, arr, target);

            arr[i] = arr[start];
            arr[start] = temp;
        }
    }
}
