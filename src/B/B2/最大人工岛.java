package B.B2;

import java.util.*;

public class 最大人工岛 {
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(1, s.length() - 1);

        ArrayList<String[]> a = new ArrayList<>();
        while (s.contains("[")) {
            int start = s.indexOf("[");
            int end = s.indexOf("]");
            String temp = s.substring(start + 1, end);
            a.add(temp.split(","));
            s = s.substring(end + 1);
        }

        String[][] arrS = new String[a.size()][];
        for (int i = 0; i < a.size(); i++) {
            arrS[i] = a.get(i);
        }

        int[][] arr = new int[arrS.length][arrS[0].length];
        for (int i = 0; i < arrS.length; i++) {
            for (int j = 0; j < arrS[0].length; j++) {
                arr[i][j] = Integer.parseInt(arrS[i][j]);
            }
        }

        int max = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    flag = true;
                    boolean[][] b = new boolean[arr.length][arr[0].length];
                    count = 0;
                    arr[i][j] = 1;
                    dfs(i, j, arr, b);
                    arr[i][j] = 0;
                    max = Math.max(max, count);
                }
            }
        }
        if (flag) {
            System.out.println(max);
        } else {
            System.out.println(arr.length * arr[0].length);
        }
    }

    public static void dfs(int x, int y, int[][] arr, boolean[][] visit) {
        if (x < 0 || y < 0 || x >= arr.length || y >= arr[0].length || visit[x][y] || arr[x][y] == 0) {
            return;
        }

        count++;
        visit[x][y] = true;

        dfs(x + 1, y, arr, visit);
        dfs(x - 1, y, arr, visit);
        dfs(x, y + 1, arr, visit);
        dfs(x, y - 1, arr, visit);

    }
}
