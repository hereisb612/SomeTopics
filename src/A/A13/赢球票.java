package A.A13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 赢球票 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> input = new ArrayList<>();

        int max = 0;

        for (int i = 0; i < n; i++) {
            input.add(sc.nextInt());
            max = Math.max(max, input.get(i));
        }

        int[] target = new int[n];

        // input

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> arr = new ArrayList<>(input);

            int ans = 0;
            int count = 0;
            int index = i;

            while (arr.size() > 0) {
                count++;

                if (count > max) {
                    break;
                }

                if (count == arr.get(index)) {
                    ans += arr.get(index);
                    arr.remove(index);
                    index--;
                    count = 0;
                }

                index++;

                if (index == arr.size()) {
                    index = 0;
                }
            }

            target[i] = ans;
        }

        Arrays.sort(target);
        System.out.println(target[target.length - 1]);
    }
}
