package baekjoon.Silver.four;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SearchNum_1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] N = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            N[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(N);

        int mount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<mount; i++){
            int target = Integer.parseInt(st.nextToken());

            if(binarySearch(N, target)){
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
    }

    private static boolean binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid =(low+high)/2;
            if (arr[mid] == target) {
                return true;
            }
            else if (arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid +1;
            }
        }
        return false;
    }
}