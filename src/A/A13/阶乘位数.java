package A.A13;

import java.math.BigInteger;

public class 阶乘位数 {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("1");
        for (int i = 1; i <= 9999; i++) {
            BigInteger x = new BigInteger(i + "");
            n = n.multiply(x);
        }
        System.out.println(n.toString(2).length());
    }
}
