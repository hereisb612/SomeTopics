package A.A15;

public class 数的分解 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 2019; i++) {
            for (int j = i + 1; j < 2019; j++) {
                for (int k = j + 1; k < 2019; k++) {
                    if (i + j + k == 2019) {
                        String s = i + "" + j + "" + k;
                        if (!s.contains("2") && !s.contains("4")) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
