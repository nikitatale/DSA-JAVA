// This optimized solution solves the Product of Array Except Self problem using the prefix and suffix 
// product technique in O(n) time. First, we create a prefix array where each index stores the
// product of all elements to the left of it. We initialize prefix[0] = 1 because there 
// are no elements to the left of index 0. Then we create a suffix array where each index 
// stores the product of all elements to the right of it, initializing the last element as 
// 1 since nothing exists to its right. Finally, for each index i, we multiply prefix[i] and 
// suffix[i] to get the product of all elements except nums[i]. 
// This reduces time complexity from O(n²) to O(n), but it uses O(n) extra space.


import java.util.Arrays;

public class Optimized {
    public static  int[] productExceptSelf(int[] nums) {
         int newArr[] = new int[nums.length];
         int prefix[] = new int[nums.length];
         int suffix[] = new int[nums.length];
         
         prefix[0] = 1;
         for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
         }

         suffix[nums.length-1] = 1;
         for(int i=nums.length-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
         }

         for(int i=0; i<nums.length; i++){
           newArr[i] = prefix[i] * suffix[i];
         }
         return newArr;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int result[] = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}