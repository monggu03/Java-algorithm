package baekjoon.Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class jwapo_11650 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[][] list = new int[count][2];
        for(int i=0; i<count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();

        Arrays.sort(list, (a,b) ->{
            int result = a[0]-b[0];
            if(result!=0){
                return result;
            }
            return a[1]-b[1];

        });

        for(int i=0; i<count; i++){
            sb.append(list[i][0]).append(" ").append(list[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}