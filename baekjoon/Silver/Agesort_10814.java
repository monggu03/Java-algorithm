package baekjoon.Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Agesort_10814 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[][] list = new String[count][2];

        for(int i=0; i<count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i][0] = st.nextToken();
            list[i][1] = st.nextToken();
        }

        Arrays.sort(list, (a, b) ->
                Integer.parseInt(a[0])-Integer.parseInt(b[0])
        );

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            sb.append(list[i][0]).append(" ").append(list[i][1]).append("\n");
        }
        System.out.print(sb);
    }
}