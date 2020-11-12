package B.B4;

import java.util.Scanner;

public class 单词方阵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                plan(i, j, arr, visited);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (visited[i][j]) {
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void plan(int i, int j, char[][] arr, boolean[][] visited) {
        int[] x = {0, 0, -1, 1, -1, 1, -1, 1};
        int[] y = {-1, 1, 0, 0, 1, 1, -1, -1};

        for (int k = 0; k < 8; k++) {
            find(i, j, arr, visited, x[k], y[k]);
        }
    }

    private static void find(int i, int j, char[][] arr, boolean[][] visited, int dx, int dy) {
        String s = "yizhong";

        if (arr[i][j] != s.charAt(0)) {
            return;
        }

        for (int k = 1; k < s.length(); k++) {
            i += dx;
            j += dy;

            if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length) {
                return;
            }

            if (arr[i][j] != s.charAt(k)) {
                return;
            }
        }

        for (int k = 1; k < arr.length; k++) {
            visited[i][j] = true;
            i -= dx;
            j -= dy;
        }

    }
}
