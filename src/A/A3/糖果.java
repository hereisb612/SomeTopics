package A.A3;

import java.util.ArrayList;
import java.util.Scanner;

public class 糖果 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        int p = n + m;



        int max = 0;

        for (Integer integer : arr) {
            if (integer > max) {
                max = integer;
            }
        }

        System.out.println(max);
    }
}
