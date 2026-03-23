// Use two pointers (left, right) and keep adding elements to sum by moving right.
// When sum ≥ target, update minimum length and shrink window by moving left.
// Keep repeating: expand → check → shrink.
// No extra array needed, just track sum and pointers.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class MinSizeSubarraySum{

   public static int minSizeSubarraySum(int nums[], int target) {
       int sum = 0;
       int left = 0;
       int minLength = Integer.MAX_VALUE;
       for(int right=0; right<nums.length; right++){
         sum += nums[right];  // expand

         while (sum >= target) {   // condition satisfy
             minLength = Math.min(minLength, right - left + 1);
             sum -= nums[left];  // shrink
             left++;
         }
       }
       return minLength == Integer.MAX_VALUE ? 0 : minLength;
   }

   public static void main(String[] args) {
      int nums[] = {2,3,1,2,4,3};
      int target = 7;
      int res = minSizeSubarraySum(nums, target);
      System.out.print(res);

    }
}