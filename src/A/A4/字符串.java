package A.A4;

public class 字符串 {
    public static void main(String[] args) {
        String s = "A";
        for (int i = 0; i < 5; i++) {
            s = s + (char) ('B' + i) + s;
            System.out.println(s);
        }
    }
}
