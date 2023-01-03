package javaSolutions;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void solution(List<Integer> arr){
        int posNums = 0;
        int negNums = 0;
        int zeroNums = 0;
        int size = arr.size();
        String sixDecimal = "%.6f%n";

        for (int i = 0; i < size; i++){
            if (arr.get(i) > 0){
                posNums++;
            }
            else if (arr.get(i) < 0){
                negNums++;
            }
            else if (arr.get(i) == 0){
                zeroNums++;
            }
        }
        if (size != 0){
            System.out.format(sixDecimal,(float)posNums / size);
            System.out.format(sixDecimal,(float)negNums / size);
            System.out.format(sixDecimal,(float)zeroNums / size);
        }
    }

    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(0);
        nums.add(-1);
        nums.add(-1);
        PlusMinus.solution(nums);
    }
}
