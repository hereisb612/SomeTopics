package B.B5;

import java.util.Arrays;
import java.util.Scanner;

public class 小朋友找朋友 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
        }
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(name);
        Arrays.sort(num);
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
            System.out.print(num[i]);
            System.out.println();
        }
    }
}
