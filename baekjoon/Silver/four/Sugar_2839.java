package baekjoon.Silver.four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sugar_2839 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int result = -1;
        for(int i = count/5; i>=0; i--){
            int remain = count - i*5;
            if(remain%3==0){
                result = i + remain/3;
                break;
            }
        }
        System.out.print(result);
    }
}