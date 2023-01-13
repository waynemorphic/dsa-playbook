package javaSolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StoreMerchant {
    public static int storeMerchant(int n, List<Integer> arr){
        int count = 0;
        Set<Integer> store = new HashSet<>();
        Collections.sort(arr);

        for (int i = 0; i < n; i++){
            if (store.contains(arr.get(i))){
                count++;
                store.remove(arr.get(i));
            }
            else{
                store.add(arr.get(i));
            }
        }
        System.out.println(count);
        return count;


    }
    public static void main(String[] args){
        int n = 9;
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(20);
        nums.add(10);
        nums.add(10);
        nums.add(30);
        nums.add(50);
        nums.add(10);
        nums.add(20);

        StoreMerchant.storeMerchant(n, nums);
    }
}
