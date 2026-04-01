package baekjoon.bronze;

import java.util.Scanner;

public class palindrom_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = sc.nextInt();

            if (number == 0) {
                break;  // 0이면 종료
            }

            String str = Integer.toString(number);
            String reverse = new StringBuilder(str).reverse().toString();

            if (str.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}