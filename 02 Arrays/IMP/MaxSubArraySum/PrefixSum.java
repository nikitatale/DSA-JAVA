// Prefix Sum approach to print max sub array sum in O(n^2) time complexity
// create one extra array where we store - prefix[i] = sum of index 0 to i 
// prefix[i] = prefix[i-1] + nums[i] = only creates prefix array
// if count sub array sum formula - sum(i to j) = prefix[j] - prefix[i-1]
// if prefix 0 -> sum = prefix[j] 
// currsum = prefix[end] - prefix[start-1] return sum of subarray from index start to end using prefix array
// time complexity - O(n * n) = O(n^2)



public class PrefixSum{

  public static void maxSubArraySum(int nums[]) {
     int currSum = 0;
     int maxSum = Integer.MIN_VALUE;

     int prefix[] = new int[nums.length];
     prefix[0] = nums[0];

     for(int i=1; i<prefix.length; i++){
        prefix[i] = prefix[i-1] + nums[i];
     }

     for(int i=0; i<nums.length; i++){
        int start = i;
        for(int j=i; j<nums.length; j++){
            int end = j;
            currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                System.out.println(currSum);

            if(maxSum < currSum){
            maxSum = currSum;
        }
        }

        System.out.println(" ");
     }
     System.err.println("Max sub array sum = " + maxSum);
  }

  public static void main(String[] args) {
      int nums[] = {1, -2, 6, -1, 8};
      maxSubArraySum(nums);
  }
}