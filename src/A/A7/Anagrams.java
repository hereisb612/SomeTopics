package A.A7;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();

        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        boolean h = true;

        if (c.length == d.length) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] != d[i]) {
                    h = false;
                    break;
                }
            }
        } else {
            h = false;
        }

        System.out.println(h);
    }
}
