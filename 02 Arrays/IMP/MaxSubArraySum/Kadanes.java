// Kadane's algorithm is effficient method to find the max sum of contigues sub array in array
// we keep running sum  (currSum)
// if running sum becomes negative - reset it to 0
// and compare max sum with curr sum and update max sum
// Time complexity - O(n)
// Space complexity - O(1)
// IMP Edge case -  if array element are all negative - { -2, -3, -1, -5} ans will be smallest negative number = -1
// but we use Integer.MIN_VALUE so it handles the case no worries :) 

public class Kadanes{
    
    public static void maxSubArraySum(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(currSum < 0){
                currSum = 0;
            }
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max sub array sum = " + maxSum);
    }
    
    public static void main(String[] args) {
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubArraySum(nums);

    }
}