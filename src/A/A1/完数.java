package A.A1;

import java.util.ArrayList;

public class 完数 {
    public static void main(String[] args) {

        int wanshu = 0;

        for (int i = 1; i < 1000; i++) {

            ArrayList<Integer> yinzi = new ArrayList<>();
            int ans = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    yinzi.add(j);
                }
            }

            for (int k : yinzi) {
                ans += k;
            }

            if (ans == i) {
                wanshu++;
            }
        }

        System.out.println(wanshu);
    }
}
