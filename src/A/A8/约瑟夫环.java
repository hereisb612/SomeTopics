package A.A8;

import java.util.ArrayList;
import java.util.Scanner;

public class 约瑟夫环 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }

        int index = 0;
        int count = 0;

        while (arr.size() > 1) {
            count++;
            if (count == K) {
                arr.remove(index);
                index--;
                count = 0;
            }

            index++;
            if (index == arr.size()) {
                index = 0;
            }
        }

        System.out.println(arr.get(0));

    }
}
