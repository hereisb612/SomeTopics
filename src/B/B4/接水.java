package B.B4;

import java.util.*;

public class 接水 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            arr.add(m[i]);
        }

        Collections.sort(arr);
        double waitTime = 0;
        String ans = "";

        while (arr.size() > 0) {
            int temp = arr.get(0);
            arr.remove(0);
            waitTime += temp * arr.size();

            for (int i = 0; i < m.length; i++) {
                if (m[i] == temp && m[i] != -1) {
                    ans += (i + 1) + " ";
                    m[i] = -1;
                }
            }
        }

        System.out.println(ans);
        System.out.printf("%.2f", waitTime / n);
    }
}
