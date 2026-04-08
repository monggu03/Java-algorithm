package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nayul_10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine().trim());
        int[] list = new int[10001];
        for(int i=0; i<count; i++){
            list[Integer.parseInt(br.readLine().trim())]++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<10001; i++){
            while(list[i]>0){
                sb.append(i).append("\n");
                list[i]--;
            }
        }

        System.out.print(sb);

    }
}
