package B.B1;

import java.util.Scanner;

public class 岛屿个数 {
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            char[] temp = sc.next().toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = temp[j] - '0';
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    ans++;
                    toZero(arr, i, j);
                }
            }
        }

        System.out.println(ans);
    }

    private static void toZero(int[][] arr, int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return;
        }

        if (arr[i][j] != 1) {
            return;
        }

        arr[i][j] = 0;

        toZero(arr, i + 1, j);
        toZero(arr, i - 1, j);
        toZero(arr, i, j - 1);
        toZero(arr, i, j + 1);
    }
}