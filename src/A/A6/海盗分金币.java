package A.A6;

public class 海盗分金币 {
    public static void main(String[] args) {
        for (int i = 1000; i < 1000000; i++) {
            int m = i;

            if ((m + 1) % 5 == 0) {
                m += 1;
                m -= m / 5;
                if ((m + 1) % 5 == 0) {
                    m += 1;
                    m -= m / 5;
                    if ((m + 1) % 5 == 0) {
                        m += 1;
                        m -= m / 5;
                        if ((m + 1) % 5 == 0) {
                            m += 1;
                            m -= m / 5;
                            if ((m + 1) % 5 == 0) {
                                m += 1;
                                m -= m / 5;
                                if (m >= 2000) break;
                                System.out.println(m);
                            }
                        }
                    }
                }
            }
        }
    }
}
