package javaSolutions;

import java.util.Scanner;

public class ArithmeticSeries{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i = 0;i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for (int k = 0; k < n; k++){
                int j = a + (int)(Math.pow(2, k) * b ) + (int)(Math.pow(2, k) - 1) * b; 
                System.out.print(j + " ");
            }
            System.out.println();
            
        }
        in.close();
    }
}