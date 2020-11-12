package A.A9;

public class 一步之遥 {
    public static void main(String[] args) {
        int now = 0;
        int target = 1;
        int count = 0;

        while (now != target) {
            if (now < target) {
                now += 97;
                count++;
            }

            if (now > target) {
                now -= 127;
                count++;
            }
        }

        System.out.println(count);
    }
}
