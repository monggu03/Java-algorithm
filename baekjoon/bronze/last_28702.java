package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class last_28702 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[3];
        int num = 0;
        for(int i =0; i<3; i++){
            list[i] = br.readLine();
            try{
                int n = Integer.parseInt(list[i]);
                num = n +(3-i);
            }catch(NumberFormatException e){
            }
        }
        if(num%3==0||num%5==0){
            if(num%3==0){
                if(num%5==0){
                    System.out.print("FizzBuzz");
                }
                else{
                    System.out.print("Fizz");
                }
            }
            else{
                System.out.print("Buzz");
            }
        }
        else{
            System.out.print(num);
        }
    }
}