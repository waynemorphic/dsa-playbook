package Algorithms.Kadane;

/*
* You are given an array of integers of size N consisting of zeros and ones. You 
* have to select a subset and flip bits of that subset. You have to return the 
* count of maximum one's that you can obtain by flipping chosen sub-array at most
* once.
* A flip operation is one in which you turn 1 into 0 and zero into 1
* 
* *** Example
* If you are given an array {1,1,0,0,1} then you will have to return the count of 
* maximum one's you can obtain by flipping anyone chosen sub-array at most once, so
* here you will clearly choose subarray from the index 2 to 3 and then flip it's bits.
* So, the final array comes out to be {1,1,1,1,1} which contains five ones and so you
* will return 5
* 
* *** Sample Input
* 1, 0, 0, 1, 0
* 1, 1, 1, 0
* 0, 0, 1, 0, 0
* 
* *** Sample Output
* 4
* 4
* 4
* 
* *** Explanation
* Test case 1: We can flip in the range [2,3], thus => {1, 1, 1, 1, 0}
* Test case 2: We can flip in the range [3,3]. thus => {1, 1, 1, 1}
* Test case 3:We can flip in the range [0,4], thus => {1, 1, 0, 1, 1}
* 
*/
public class FlipBits {
    public static int flipBits(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++){
            // Check if ith value is 0 or not
            // if the value is 0, the curSum += 1 else curSum += -1
            curSum += (arr[i] == 1 ? 1 : -1);

            // finding max between curSum and max and updating max
            max = Math.max(max, curSum);

            // check if sum becomes less than 0, if yes reinitialize it with 0
            if (curSum < 0){
                curSum = 0;
            }

            // if ith element is 1, then increment by 1
            if (arr[i] == 1){
                count++;
            }
        }
        return max + count;
    }
    public static void main(String[] args){

    }
    
}
