package javaSolutions;

import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {

    public static int subArr(List<Integer> arr, int d, int m){
        int count = 0;
        int sum = 0;
        int len = arr.size();

        // if (len > m){
        //     return 0;
        // }

        // for (int i = 0; i < m; i++){
        //     sum += arr.get(i);
        // }

        // for (int j = m + 1; j < len - m; j++){
        //     sum += arr.get(j) - arr.get(j + m);
        //     if (sum == d){
        //         count++; 
        //     }
        // }
        for (int i = 0;  i + m <= len; i++){
            for(int j = 0; j < m; j++){
                System.out.println(arr.get(j));
                sum += arr.get(i + j);
            }
            if (sum == d){
                count++;
            }
            sum = 0;
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        int d = 3;
        int m = 2;

        SubArrayDivision.subArr(arr, d, m);
    }
    
}
