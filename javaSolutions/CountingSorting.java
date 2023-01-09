package javaSolutions;

import java.util.ArrayList;
import java.util.List;

public class CountingSorting {
    public static List<Integer> solution (List<Integer> arr){
        List<Integer> res = new ArrayList<>();

        // Add zeros only
        for (int i = 0; i < 100; i++){
            res.add(0);
        }

        // For every value in the array, increase its value and add it to the collection
        for (int j : arr){
            res.set(j, res.get(j) + 1);
        }
        System.out.print(res);
        return res;
    }

    public static void main(String[] args){
        List<Integer> sol = new ArrayList<>();
        for (int k = 0; k < 10; k++){
            sol.add(k);
        }
        CountingSorting.solution(sol);
    }
}
