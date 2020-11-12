package A.A1;

import java.util.*;

public class 交并余 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int An = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < An; i++) {
            A.add(sc2.nextInt());
        }

        Scanner sc3 = new Scanner(System.in);
        int Bn = sc3.nextInt();

        Scanner sc4 = new Scanner(System.in);
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < Bn; i++) {
            B.add(sc4.nextInt());
        }

        ////////

        ArrayList<Integer> jiao = new ArrayList<>();
        ArrayList<Integer> yu = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            Integer a = A.get(i);
            if (B.contains(a)) {
                jiao.add(a);
            } else {
                yu.add(a);
            }
        }

        Collections.sort(jiao);
        Collections.sort(yu);

        ////////

        TreeSet<Integer> bing = new TreeSet<>();
        bing.addAll(A);
        bing.addAll(B);

        ///

        System.out.println(jiao);
        System.out.println(bing);
        System.out.println(yu);


    }
}
