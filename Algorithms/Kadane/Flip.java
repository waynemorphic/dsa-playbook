package Algorithms.Kadane;

/*


Problem Description
 
You are given a binary string A(i.e. with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean change character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in final string number of 1s is maximised.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.



Problem Constraints
1 <= size of string <= 100000


Input Format
First and only argument is a string A.



Output Format
Return an array of integers denoting the answer.



Example Input
Input 1:

A = "010"
Input 2:

A = "111"


Example Output
Output 1:

[1, 1]
Output 2:

[]


Example Explanation
Explanation 1:

A = "010"


Pair of [L, R] | Final string
____________|__________
[1 1]          | "110"
[1 2]          | "100"
[1 3]          | "101"
[2 2]          | "000"
[2 3]          | "001"



We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].

Explanation 2:

No operation can give us more than three 1s in final string. So, we return empty array [].


*/

 import java.util.*;

import javax.print.DocFlavor.STRING;
public class Flip {
    public static List<Integer> flipBits(String A){
        int curSum = 0;
        int left = 0;
        int right = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] arr = new int[A.length()];
        int[] res = new int[2]; 
        List<Integer> count = new ArrayList<>();       

        for (int i = 0; i < arr.length; i++){
            curSum += arr[i];
            if (curSum > maxSum){
                maxSum = curSum;
                res[0] = left + 1;
                res[1] = right + 1;
            }
            if (curSum < 0){
                curSum = 0;
                left = i + 1;
            }
        }
        for (int i : res){
            count.add(i);
        }
        return count;
    }
    public static void main(String[] args){
        String A = "010";
        String B = "111";
        String C = "00100";
        System.out.println(Flip.flipBits(A));
        System.out.println(Flip.flipBits(B));
        System.out.println(Flip.flipBits(C));
    }
}
