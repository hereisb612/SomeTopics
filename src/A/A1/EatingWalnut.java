package A.A1;

public class EatingWalnut {
    public static void main(String[] args) {
        int walnut = 1543;
        int ans = 0;

        while(walnut != 1){
            if (walnut % 2 == 1){
                walnut = (walnut - 1) / 2;
                ans += 1;
            } else {
                walnut = walnut / 2;
            }
        }
        System.out.println(ans + 1);
    }
}
