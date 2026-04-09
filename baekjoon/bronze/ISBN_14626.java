package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ISBN_14626 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ISBN = br.readLine().trim();
        int result = 0;
        int starIndex = ISBN.indexOf('*');
        int weight = (starIndex % 2 == 0) ? 1 : 3;
        for(int i=0; i<13; i++){
            char c = ISBN.charAt(i);
            if(c=='*'){
                continue;
            }
            else{
                int num = c - '0';
                if(i%2==0){
                    result += num;
                }
                else{
                    result += num*3;
                }
            }
        }
        for(int i=0; i<10; i++){
            int sum = result + i * weight;
            if(sum%10==0){
                System.out.print(i);
                break;
            }
        }
    }
}