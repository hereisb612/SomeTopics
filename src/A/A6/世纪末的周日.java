package A.A6;

import java.util.Calendar;

public class 世纪末的周日 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        for (int i = 1999; i < Integer.MAX_VALUE; i += 100) {
            c.set(i, Calendar.DECEMBER, 31);

            if (c.get(Calendar.DAY_OF_WEEK) == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}

