package B.B3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LuckyWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        Arrays.sort(c);

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            int count = 1;
            if (!map.containsKey(c[i])) {
                for (int j = i + 1; j < c.length; j++) {
                    if (c[i] == c[j]) {
                        count++;
                    }
                }
                map.put(c[i], count);
            }
        }

        int max = 0, min = Integer.MAX_VALUE;
        for (Character s : map.keySet()) {
            int maxtemp = map.get(s);
            int mintemp = map.get(s);
            max = Math.max(maxtemp, max);
            min = Math.min(mintemp, min);
        }

        int max_min = max - min;
        boolean b = true;

        if (max_min != 0 && max_min != 1) {
            for (int i = 2; i < max_min; i++) {
                if (max_min % i == 0) {
                    b = false;
                    System.out.println("No Answer!");
                    System.out.println("0");
                    break;
                }
            }
            if (b) {
                System.out.println("Lucky Word!");
                System.out.println(max_min);
            }
        } else {
            System.out.println("No Answer!");
            System.out.println("0");
        }
    }
}
