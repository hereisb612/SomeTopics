package A.A1;

public class 字符串填空 {
    public static void main(String[] args) {
        String s = "4725873285783245723";
        System.out.println(f(s, 0, s.length()));
    }

    public static int f(String s, int begin, int end) {
        int mid;
        if (end - begin == 1) {
            return s.charAt(begin) - '0';
        }

        mid = (end + begin) / 2;
        return f(s, begin, mid) + f(s, mid, end);
    }
}
