package A.A4;

import java.util.Scanner;

public class 倍数问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    int t = arr[i] + arr[j] + arr[k];

                    if (t % K == 0 && t > max) {
                        max = t;
                    }
                }
            }
        }

        System.out.println(max);

    }
}
