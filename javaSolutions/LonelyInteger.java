package javaSolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class LonelyInteger {
    public static int solution(List<Integer> a){
        Collections.sort(a);
        int len = a.size();
        int j = 0;
        

        for (int i : a){
            int count = 0;
            for (int k : a) {
                if(i == k){
                    count++;
                }
            }
            if (count == 1){
                j = i;
            }            
        }
        System.out.println(j);
        return j;

        // if (len > 1){
        //     int k = a.get(len - 1);
        //     int l = a.get(len - 2);

        //     if (k != l){
        //         j = k;
        //         System.out.println(j);
        //     }
        //     else {
        //         System.out.println("No unique numbers found");
        //     }
            
        // }
        // else if (len == 1){
        //         j = a.get(len - 1);
        //         System.out.println(j);
        //     }
        // return j;
    }

    public static void main (String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(4);

        List<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);
        nums1.add(3);
        nums1.add(2);
        nums1.add(1);
        
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(1);        
        
        LonelyInteger.solution(nums);
        LonelyInteger.solution(nums1);
        LonelyInteger.solution(nums2);
    }}
