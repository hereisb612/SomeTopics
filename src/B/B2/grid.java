package B.B2;

import java.util.ArrayList;
import java.util.Scanner;

public class grid {
    static boolean ans = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.substring(1, s.length() - 1);

        ArrayList<String[]> input = new ArrayList<>();

        while (s.contains("[")) {
            int start = s.indexOf("[");
            int end = s.indexOf("]");
            String temp = s.substring(start + 1, end);
            input.add(temp.split(","));
            s = s.substring(end + 1);
        }

        String[][] arr = new String[input.size()][];
        for (int i = 0; i < input.size(); i++) {
            arr[i] = input.get(i);
        }

        int maxTime = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                maxTime = Math.max(maxTime, Integer.parseInt(arr[i][j]));
            }
        }

        for (int i = 0; i <= maxTime; i++) {
            boolean[][] b = new boolean[arr.length][arr[0].length];
            dfs(0, 0, i, arr, b);
            if (ans) {
                System.out.println(i);
                break;
            }
        }
    }

    private static void dfs(int x, int y, int time, String[][] arr, boolean[][] b) {
        if (x < 0 || y < 0 || x >= arr.length || y >= arr[0].length || b[x][y] || time < Integer.parseInt(arr[x][y])) {
            return;
        }

        if (x == arr.length - 1 && y == arr[0].length - 1) {
            ans = true;
            return;
        }

        b[x][y] = true;

        dfs(x + 1, y, time, arr, b);
        dfs(x - 1, y, time, arr, b);
        dfs(x, y + 1, time, arr, b);
        dfs(x, y - 1, time, arr, b);
    }
}
