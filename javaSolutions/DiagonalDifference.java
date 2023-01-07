package javaSolutions;
import java.util.*
;
public class DiagonalDifference{
    public static int solution(List<List<Integer>> arr){
        int len = arr.size();
        int diff = 0;
        
        
        for (int i = 0; i < len; i++){
            int j = len - 1 - i;
            diff += arr.get(i).get(i) - arr.get(j).get(i);
        }
        System.out.println(Math.abs(diff));
        return Math.abs(diff);
        }
    

    public static void main(String[] args){
        List<List<Integer>> arrs = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(2);
        b.add(3);
        b.add(4);
        arrs.add(a);
        arrs.add(b);
        System.out.print(arrs);
        DiagonalDifference.solution(arrs);
        
    }
}