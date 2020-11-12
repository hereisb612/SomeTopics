package A.A11;

public class 反幻方 {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int count = 0;

    public static void main(String[] args) {
        f(0, arr.length - 1);
        System.out.println(count / 8);
    }

    public static void f(int start, int end) {
        if (start == end) {
            int[] ans = new int[8];
            boolean b = true;
            ans[0] = arr[0] + arr[1] + arr[2];
            ans[1] = arr[3] + arr[4] + arr[5];
            ans[2] = arr[6] + arr[7] + arr[8];
            ans[3] = arr[0] + arr[3] + arr[6];
            ans[4] = arr[1] + arr[4] + arr[7];
            ans[5] = arr[2] + arr[5] + arr[8];
            ans[6] = arr[0] + arr[4] + arr[8];
            ans[7] = arr[2] + arr[4] + arr[6];

            for (int i = 0; i < ans.length; i++) {
                for (int j = i + 1; j < ans.length; j++) {
                    if (ans[i] == ans[j]) {
                        b = false;
                        break;
                    }
                }
            }

            if (b) {
                count++;
            }

            return;
        }

        for (int i = start; i <= end; i++) {
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;

            f(start + 1, end);

            arr[i] = arr[start];
            arr[start] = temp;
        }
    }
}
