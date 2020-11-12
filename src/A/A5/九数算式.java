package A.A5;

import java.util.HashSet;

public class 九数算式 {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int ans = 0;

    public static void main(String[] args) {
        f(0, arr.length - 1);
        System.out.println(ans / 2);
    }

    public static void f(int start, int end) {

        if (start == end) {
            int t1 = 0;
            for (int i = 0; i < arr.length; i++) {
                t1 = t1 * 10 + arr[i];
                int t2 = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    t2 = t2 * 10 + arr[j];
                }
                String t3 = String.valueOf(t1 * t2);
                if (!t3.contains("0")) {
                    char[] c = t3.toCharArray();
                    HashSet<Character> h = new HashSet<>();
                    for (char c1 : c) {
                        h.add(c1);
                    }
                    if (h.size() == 9) {
                        ans++;
                    }
                }
            }
            return;
        }

        for (int i = start; i <= end; i++) {
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;

            f(start + 1, end);

            arr[i] = arr[start];
            arr[start] = temp;
        }
    }
}
