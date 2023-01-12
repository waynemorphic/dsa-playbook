package javaSolutions;

import java.util.Scanner;

public class SubArrays {
    public static void subArr(int[] arr){
        int count = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++){
            int sum = 0;
            for (int j = i; j < len; j++){
                sum += arr[j];

                if (sum < 0){
                    count++;
                }
            }            
        }
        System.out.println(count);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        SubArrays.subArr(arr);
        
    }
}
