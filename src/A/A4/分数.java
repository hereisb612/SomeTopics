package A.A4;

public class 分数 {
    public static void main(String[] args) {
        int mom = (int) Math.pow(2, 19);
        int son = 0;

        for (int i = 19; i >= 0; i--) {
            son += (int) Math.pow(2, i);
        }

        System.out.println(son + "/" + mom);
    }
}