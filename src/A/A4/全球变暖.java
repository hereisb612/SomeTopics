package A.A4;

import java.util.Scanner;

public class 全球变暖 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().toCharArray();
        }

        System.out.println(f(arr));


    }

    public static int f(char[][] arr) {
        int ans = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                if (arr[i][j] == '#' && arr[i][j + 1] == '#' && arr[i + 1][j] == '#' && arr[i + 1][j + 1] == '#') {
                    if (arr[i - 1][j - 1] == '.' && arr[i - 1][j] == '.' && arr[i - 1][j + 1] == '.' && arr[i - 1][j + 2] == '.'
                            && arr[i][j - 1] == '.' && arr[i][j] == '#' && arr[i][j + 1] == '#' && arr[i][j + 2] == '.' &&
                            arr[i + 1][j - 1] == '.' && arr[i + 1][j] == '#' && arr[i + 1][j + 1] == '#' && arr[i + 1][j + 2] == '.' &&
                            arr[i + 2][j - 1] == '.' && arr[i + 2][j] == '.' && arr[i + 2][j + 1] == '.' && arr[i + 2][j + 2] == '.') {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
