package javaSolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class MaxHourGlass {
    public static int hourGlass(List<List<Integer>> arr){
        int R = 6;
        int C = 6;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= R - 3; i++){
            for (int j = 0; j <= C - 3; j++){
                int sum = (arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)) + 
                (arr.get(i + 1).get(j + 1)) + 
                (arr.get(i + 2).get(j) + arr.get(1 + 2).get(j + 1) + arr.get(i + 2).get(j + 2));

                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
        return maxSum;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        MaxHourGlass.hourGlass(arr);
        bufferedReader.close();
    }
}
