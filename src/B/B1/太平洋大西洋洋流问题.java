package B.B1;

import java.util.*;

public class 太平洋大西洋洋流问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] arr = new int[M][N];
        boolean[][] Tai = new boolean[M][N];
        boolean[][] Da = new boolean[M][N];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            dfs(arr, i, 0, Tai, arr[i][0]);
            dfs(arr, i, M - 1, Da, arr[i][M - 1]);
        }

        for (int i = 0; i < N; i++) {
            dfs(arr, 0, i, Tai, arr[0][i]);
            dfs(arr, M - 1, i, Da, arr[M - 1][i]);
        }

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (Tai[i][j] && Da[i][j]) {
                    ans.add(new int[]{i, j});
                }
            }
        }
        System.out.println(ans);
    }

    private static void dfs(int[][] arr, int x, int y, boolean[][] visit, int pre) {
        if (x < 0 || y < 0 || x >= arr.length || y >= arr[0].length || visit[x][y] || arr[x][y] < pre) {
            return;
        }

        visit[x][y] = true;

        dfs(arr, x + 1, y, visit, arr[x][y]);
        dfs(arr, x - 1, y, visit, arr[x][y]);
        dfs(arr, x, y + 1, visit, arr[x][y]);
        dfs(arr, x, y - 1, visit, arr[x][y]);

    }
}
