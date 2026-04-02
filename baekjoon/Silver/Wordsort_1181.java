package baekjoon.Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.Comparator;

public class Wordsort_1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        TreeSet<String> list = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare (String s1, String s2){
                if(s1.length()!=s2.length()){
                    return s1.length()-s2.length();
                }
                return s1.compareTo(s2);
            }
        });

        for(int i=0; i<count; i++){
            list.add(br.readLine());
        }

        for(String o : list){
            System.out.println(o);
        }
    }
}