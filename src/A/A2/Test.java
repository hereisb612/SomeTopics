package A.A2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            a.add(sc.nextInt());
        }
    }
}
