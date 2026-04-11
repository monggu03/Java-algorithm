package baekjoon.Silver.four;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Card2_2164 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int count = Integer.parseInt(br.readLine());
        for(int i=0; i<count; i++){
            queue.add(i+1);
        }
        while(queue.size()>1){
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.print(queue.peek());
    }
}