package A.A15;

import java.util.TreeSet;

public class 不同子串 {
    public static void main(String[] args) {
        String s = "0100110001010001";

        TreeSet<StringBuilder> h = new TreeSet<>();

        for (int i = 1; i <= s.length(); i++) {
            StringBuilder temp = new StringBuilder();
            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                temp.append(s.charAt(j));
                count++;

                if (count == i) {
                    h.add(temp);
                    temp = new StringBuilder();
                    count = 0;
                    j -= i - 1;
                }

            }
        }

        System.out.println(h.size());
    }
}
