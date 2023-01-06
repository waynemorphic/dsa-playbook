package javaSolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum{

    public static void solution(List<Integer> arr){
        long sum = 0L;
      
        for (int x : arr){
            sum += x;
        }
            System.out.printf("%d %d",sum - Collections.max(arr), sum - Collections.min(arr));
                
    }
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        MinMaxSum.solution(nums);
    }
}