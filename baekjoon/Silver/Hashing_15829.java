package baekjoon.Silver;

import java.util.Scanner;

public class Hashing_15829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String str = sc.next();

        long power = 1;
        long r = 31;
        long M = 1234567891;

        long sum = 0;


        for (int i = 0; i < count; i++) {
            int charValue = str.charAt(i) - 'a' + 1;
            sum = (sum + charValue * power) % M;  // += 하면 오류 남
            power = (power * r) % M;
        }

        System.out.println(sum);
    }
}
