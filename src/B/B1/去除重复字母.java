package B.B1;

import java.util.*;

public class 去除重复字母 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashSet<String> h = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            h.add(s.charAt(i) + "");
        }
        int n = h.size();

        char[] c = new char[n];
        int count = 0;

        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (count >= n) {
                String temp = "";
                for (int k = 0; k < c.length; k++) {
                    temp += c[k];
                }
                c = new char[n];
                al.add(temp);
                i = i - n + 1;
                count = 0;
            }

            boolean flag = true;
            for (char value : c) {
                if (value == s.charAt(i)) {
                    flag = false;
                }
            }

            if (flag) {
                c[count] = s.charAt(i);
                count++;
            }
        }

        String a = "";
        for (int i = 0; i < c.length; i++) {
            a += c[i];
        }
        al.add(a);
        Collections.sort(al);
        System.out.println(al.get(0));
    }
}
