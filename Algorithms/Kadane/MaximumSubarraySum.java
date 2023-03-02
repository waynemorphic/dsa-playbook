package Algorithms.Kadane;

/*
 * You are given an array of length N, consisting of integers. You have to find the 
 * sum of the subarray (including empty subarray) having maximu sum among all subarrays.
 * A subarray is a contiguous segment of an array. In other words, a subarray can be formed
 * by removing 0 or more integers from the beginning and 0 or more integers from the end of 
 * array
 * 
 * *** Sample Input
 * int[] arr = [1, 2, 7, -4, 3, 2, -10, 9, 1]
 * 
 * *** Sample output
 * 11
 * 
 * *** Explanation
 * The subarray yielding the maximum sum is [1, 2, 7, -4, 3, 2]
 */
public class MaximumSubarraySum {
    public static int maximumSubarraySum(int[] arr){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            curSum = Math.max(arr[i], arr[i] + curSum);
            maxSum = Math.max(maxSum, curSum);           

        }
        // checking if maxSum is negative or length of array is zero
        if (maxSum < 0 || arr.length == 0){
            maxSum = 0;
        }

        return maxSum;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 7, -4, 3, 2, -10, 9, 1};
        int[] arr2 = {10, 20, -30, 40, -50, 60};
        int[] arr3 = {-3,-2, -6};
        
        System.out.println(MaximumSubarraySum.maximumSubarraySum(arr));
        System.out.println(MaximumSubarraySum.maximumSubarraySum(arr2));
        System.out.println(MaximumSubarraySum.maximumSubarraySum(arr3));
    }
}
