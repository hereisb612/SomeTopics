package A.A1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 循环节 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int k = i; k <= j; k++) {
            arr.add(f(k));
        }

        Collections.sort(arr);
        System.out.println(arr.get(arr.size() - 1));
    }

    public static int f(int i) {
        int temp = i;
        int count = 1;

        while (temp != 1) {
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = temp * 3 + 1;
            }
            count++;
        }

        return count;
    }
}
