package A.A6;

public class 牌型种数 {

    public static void main(String[] args) {
        int ans = 0;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                for (int k = 0; k <= 4; k++) {
                    for (int l = 0; l <= 4; l++) {
                        for (int m = 0; m <= 4; m++) {
                            for (int n = 0; n <= 4; n++) {
                                for (int o = 0; o <= 4; o++) {
                                    for (int p = 0; p <= 4; p++) {
                                        for (int q = 0; q <= 4; q++) {
                                            for (int r = 0; r <= 4; r++) {
                                                for (int s = 0; s <= 4; s++) {
                                                    for (int t = 0; t <= 4; t++) {
                                                        for (int u = 0; u <= 4; u++) {
                                                            if (i + j + k + l + m + n + o + p + q + r + s + t + u == 13) {
                                                                ans++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
