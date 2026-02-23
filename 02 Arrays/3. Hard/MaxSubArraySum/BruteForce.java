//brute force approach to print max sub array sum in O(n^3) time complexity
// i - for starting point of subarray
// j - for ending point of subarray
// k - calculate sum from start to end 
// maxSum to track max sum compares with currSum 
// All loops runs n times O(n*n*n) = O(n^3)


public class BruteForce{

     public static void maxSubArraySum(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=i; j<nums.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += nums[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println("");
        }
        System.out.println("Max sub array sum = " + maxSum);
     }

    public static void main(String[] args) {
        int nums[] = {1, -2, 6, -1, 8};
        maxSubArraySum(nums);

    }
}