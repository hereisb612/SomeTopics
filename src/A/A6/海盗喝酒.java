package A.A6;

public class 海盗喝酒 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    for (int l = 1; l <= k; l++) {
                        if ((1.0 / i) + (1.0 / j) + (1.0 / k) + (1.0 / l) == 1) {
                            System.out.println(i + " " + j + " " + k + " " + l);
                        }
                    }
                }
            }
        }
    }
}
