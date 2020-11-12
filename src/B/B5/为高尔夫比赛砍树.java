package B.B5;

import java.util.*;

public class 为高尔夫比赛砍树 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        TreeSet<Integer> set = new TreeSet<>();
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > 1) {
                    set.add(anInt);
                }
            }
        }

        int now_x = 0, now_y = 0, ans = 0, count = -1;
        boolean flag = true;
        out:
        for (Integer height : set) {
            count++;
            if (height == arr[0][0] && count == 0) {
                continue;
            }
            next:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == height) {
                        int[] return_ = steps(arr, now_x, now_y, i, j);
                        if (return_ != null) {
                            now_x = return_[0];
                            now_y = return_[1];
                            ans += return_[2];
                            break next;
                        } else {
                            flag = false;
                            break out;
                        }
                    }
                }
            }
        }


        if (flag) {
            System.out.println(ans);
        } else {
            System.out.println("-1");
        }
    }

    private static int[] steps(int[][] arr, int now_x, int now_y, int target_x, int target_y) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[arr.length][arr[0].length];

        q.add(new int[]{now_x, now_y});
        visited[now_x][now_y] = true;

        int step = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!q.isEmpty()) {
            int[] xy = q.poll();

            for (int i = 0; i < 4; i++) {
                int x = xy[0] + dx[i], y = xy[1] + dy[i];
                if (x < 0 || y < 0 || x >= arr.length || y >= arr[0].length) continue;
                if (visited[x][y] || arr[x][y] < 1) continue;
                if (x == target_x && y == target_y) {
                    step++;
                    return new int[]{x, y, step};
                }

                q.add(new int[]{x, y});
                visited[x][y] = true;
            }

            step++;
        }
        return null;
    }
}

