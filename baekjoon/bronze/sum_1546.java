package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class sum_1546 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] list = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<count; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);

        double sum = 0;

        for(int i=0; i<count; i++){
            sum += (double)list[i]/list[count-1]*100;
        }

        System.out.println(sum/count);
    }
}

    