package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ihang_11050 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 1;
        // 1<=N<=10, 0<=K<=N
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for(int i=0; i<K; i++){
            result *= N;
            N--;
        }
        while(K>=1){
            result /= K;
            K--;
        }
        System.out.println(result);
    }
}