package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kmom_2775 {

    public static int[][] list = new int[15][15];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        make_APT();

        int count = Integer.parseInt(br.readLine());

        for(int i=0; i<count; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(list[k][n]).append("\n");
        }
        System.out.println(sb);
    }

    public static void make_APT() {
        for (int i =1; i<15; i++){
            list[0][i] = i;
            list[i][1] = 1;
        }

        for(int i=1; i<15; i++){
            for(int j=2; j<15; j++){
                list[i][j] = list[i-1][j]+list[i][j-1];
            }
        }
    }
}