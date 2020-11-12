package A.A7;

import java.util.ArrayList;
import java.util.Scanner;

public class 梵高 {
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        ArrayList<StringBuilder> stu = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < arr[i].length; j++) {
                s.append(arr[i][j]);
            }
            stu.add(s);
        }

        System.out.println(stu.toString());

        for (int i = 0; i < stu.size(); i++) {
            for (int j = i + 1; j < stu.size(); j++) {
                boolean t = true;
                char[] a = stu.get(i).toString().toCharArray();
                char[] b = stu.get(j).toString().toCharArray();

                for (int k = 0; k < a.length; k++) {
                    if (a[k] == b[k]) {
                        t = false;
                        break;
                    }
                }
                if (t) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

