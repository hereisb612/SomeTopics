package A.A4;

public class 星期一 {
    public static void main(String[] args) {

        int day = 0;
        // 7219

        for (int i = 1901; i <= 2000; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                day += 366;
            } else {
                day += 365;
            }
        }

        System.out.println(day);
        System.out.println(day % 7);
        System.out.println(day / 7);


    }
}
