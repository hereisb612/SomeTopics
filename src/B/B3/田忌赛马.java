package B.B3;

import java.util.*;

public class 田忌赛马 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> mine = new ArrayList<>();
        ArrayList<Integer> his = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            mine.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            his.add(sc.nextInt());
        }
        Collections.sort(mine);

        int mG = 0;
        int hG = 0;

        for (int i = 0; i < mine.size(); i++) {
            for (int j = his.size() - 1; j > 0; j--) {
                if (mine.get(i) > his.get(j)) {
                    mG++;
                    hG--;
                    mine.remove(i);
                    i--;
                    his.remove(j);
                    break;
                }
            }
        }

        for (int i = 0; i < mine.size(); i++) {
            for (int j = his.size() - 1; j > 0; j--) {
                if (mine.get(i).equals(his.get(j))) {
                    mine.remove(i);
                    i--;
                    his.remove(j);
                    break;
                }
            }
        }

        mG -= his.size();

        System.out.println(mG * 200);
    }
}
