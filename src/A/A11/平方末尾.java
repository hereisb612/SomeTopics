package A.A11;

import java.util.HashSet;

public class 平方末尾 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        for (int i = 4; i < 10000; i++) {
            String temp = String.valueOf(i * i);
            h.add(temp.substring(temp.length() - 2));
        }
        System.out.println(h.size());
    }
}
