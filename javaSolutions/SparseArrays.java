package javaSolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SparseArrays{
    public static List<Integer> solution(List<String> strings, List<String> queries){
        List<Integer> nums = new ArrayList<>();
        int sizeQueries = queries.size();
             

        for (int j = 0; j < sizeQueries; j++){
            int appears = Collections.frequency(strings, queries.get(j));
            nums.add(appears);
            }
            System.out.println(nums);
        return nums;   
        }

    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("4");
        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");

        List<String> queries = new ArrayList<>();
        queries.add("3");
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");

        SparseArrays.solution(strings, queries);
    }
}

