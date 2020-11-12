package B.B2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 加法和的和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (arr.size() >= 2) {
            Collections.sort(arr);
            int a = arr.get(0);
            int b = arr.get(1);
            arr.remove(0);
            arr.remove(0);
            ans.add(a + b);
            arr.add(a + b);
        }

        int output = 0;
        for (Integer an : ans) {
            output += an;
        }

        System.out.println(output);
    }
}
