package A.A1;

public class  ThousandDaysLater {
    static int target = 1000;
    static int year = 2014;
    static int month = 11;
    static int day = 9;
    static int[] more = new int[]{1, 3, 5, 7, 8, 10, 12};
    static boolean x = false;

    public static void main(String[] args) {
        while (target != 0) {
            if (month == 2) {
                if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
                    target -= 29;
                    month++;
                } else {
                    target -= 28;
                    month++;
                }

            } else {
                for (int i : more) {
                    if (i == month) {
                        x = true;
                        break;
                    }
                }

                if (x) {
                    if (target >= 31) {
                        target -= 31;
                        month++;
                    } else {
                        day += target;
                        target = 0;
                        if (day > 31) {
                            day -= 31;
                            month++;
                        }
                    }
                } else {
                    if (target >= 30) {
                        target -= 30;
                        month++;
                    } else {
                        day += target;
                        target = 0;
                        if (day > 30) {
                            day -= 30;
                            month++;
                        }
                    }
                }
                x = false;
            }

            if (month > 12) {
                year++;
                month = 1;
            }
        }

        String s = String.valueOf(year);
        if (month < 10) {
            s += "-0" + month;
        } else {
            s += "-" + month;
        }

        if (day < 10) {
            s += "-0" + day;
        } else {
            s += "-" + day;
        }

        System.out.println(s);
    }
}
