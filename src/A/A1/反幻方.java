package A.A1;

public class 反幻方 {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int count = 0;

    public static void main(String[] args) {
        QuanPaiLie(0, arr.length - 1);
        System.out.println(count / 8);
    }

    public static void QuanPaiLie(int start, int end) {
        if (start == end) {
            if (Test(arr)) {
                count++;
            }
            return;
        }

        for (int i = start; i <= end; i++) {
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;

            QuanPaiLie(start + 1, end);

            arr[i] = arr[start];
            arr[start] = temp;
        }
    }

    public static boolean Test(int[] plan) {
        int[] ans = new int[8];
        ans[0] = plan[0] + plan[1] + plan[2];
        ans[1] = plan[3] + plan[4] + plan[5];
        ans[2] = plan[6] + plan[7] + plan[8];
        ans[3] = plan[0] + plan[3] + plan[6];
        ans[4] = plan[1] + plan[4] + plan[7];
        ans[5] = plan[2] + plan[5] + plan[8];
        ans[6] = plan[0] + plan[4] + plan[8];
        ans[7] = plan[2] + plan[4] + plan[6];

        for (int i = 0; i < ans.length; i++) {
            for (int j = i + 1; j < ans.length; j++) {
                if (ans[i] == ans[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
