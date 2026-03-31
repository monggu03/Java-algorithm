package baekjoon.Silver;

import java.util.Scanner;

public class Poliomino_1343 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String list = sc.next();
        int count =0;
        for(int i=0; i<list.length(); i++){
            if(list.charAt(i) == 'X'){
                count++;
            }
            else{
                if (count%2!=0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        if (count%2!=0) {
            System.out.println(-1);
            return;
        }
        if (count%2==0) {
            list = list.replaceAll("XXXX", "AAAA");
            list = list.replaceAll("XX", "BB");
            System.out.println(list);
        }
    }
}
