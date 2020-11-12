package A.A8;

public class 年龄问题 {
    public static void main(String[] args) {
        int husband = 0;
        for (int i = 0; i < 200; i++) {
            if (i * 2 == (i + 20) * 1.5) {
                husband = i;
            }
        }
        System.out.println(husband * 2 / 3);
    }
}
