package B.B4;

import java.util.Scanner;

public class 跳跃游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input = input.substring(1, input.length() - 1);
        String[] arr = input.split(",");

        int index = 0;
        int count = 0;
        while (true) {
            index += Integer.parseInt(arr[index]);
            if (index >= arr.length) {
                System.out.println("true");
                break;
            }

            if (count >= arr.length) {
                System.out.println("false");
                break;
            }
            count++;
        }
    }
}
