package B.B2;

import java.util.ArrayList;
import java.util.Scanner;

public class 接水问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int time = 0;

        while (arr.size() > 0) {
            if (arr.size() > m) {
                for (int i = 0; i < m; i++) {
                    if (arr.get(i) > 0) {
                        arr.set(i, arr.get(i) - 1);
                    } else {
                        arr.remove(i);
                        i--;
                    }
                }
            } else {
                int maxTime = 0;
                for (Integer integer : arr) {
                    maxTime = Math.max(maxTime, integer);
                }
                time += maxTime;
                arr.clear();
                break;
            }
            time++;
        }

        System.out.println(time);
    }
}
