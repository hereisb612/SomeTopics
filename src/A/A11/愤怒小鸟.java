package A.A11;

public class 愤怒小鸟 {
    public static void main(String[] args) {
        int train = 1000;
        int time = 1000 / 20;
        int m = -1;

        for (int i = 0; i <= time; i++) {
            m += 1000 - 20 * i;
        }

        int bird = 50;
        int count = 0;

        for (int i = 1; i <= time; i++) {
            train -= 20;
            bird *= i;
            if (train == bird) {
                count++;
                System.out.println(i);
                System.out.println(train);
                System.out.println(bird);
                System.out.println(count);
                System.out.println("//");
            }
        }
    }
}
