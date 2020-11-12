package B.B3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 纪念品分组 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        int plan = 0;
        while (arr.size() >= 2) {
            if (arr.get(0) + arr.get(arr.size() - 1) <= w) {
                arr.remove(0);
            }
            arr.remove(arr.size() - 1);
            plan++;
        }

        if (!arr.isEmpty()) {
            if (arr.get(0) + arr.get(arr.size() - 1) <= w) {
                plan += 1;
            } else {
                plan += 2;
            }
        }

        System.out.println(plan);
    }
}
