package A.A8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 最大乘积 {
    static String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*"};
    static ArrayList<Integer> A = new ArrayList<>();

    public static void main(String[] args) {
        f(0, arr.length - 1);
        Collections.sort(A);
        System.out.println(A.get(A.size() - 1));
    }

    public static void f(int start, int end) {
        if (start == end) {
            if (arr[0].equals("*") || arr[arr.length - 1].equals("*")) return;
            StringBuilder s = new StringBuilder();
            for (String s1 : arr) {
                s.append(s1);
            }
            int target = s.indexOf("*");
            String a = s.substring(0, target);
            String b = s.substring(target + 1, s.length());
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);

            String ans = String.valueOf(x * y);

            if (ans.length() != 9 || ans.indexOf('0') != -1) return;

            char[] c = ans.toCharArray();
            HashSet<Character> h = new HashSet<>();
            for (char c1 : c) {
                h.add(c1);
            }
            if (h.size() == 9) {
                A.add(Integer.parseInt(ans));
            }
            return;
        }

        for (int i = start; i <= end; i++) {
            String temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;

            f(start + 1, end);

            arr[i] = arr[start];
            arr[start] = temp;
        }
    }
}
