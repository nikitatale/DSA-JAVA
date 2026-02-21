// Given an integer array nums, we need to return a new array where each element at index i 
// contains the product of all elements of the array except nums[i]. 
// We are not allowed to include the current index element in the multiplication.


// creates a new result array productArr. For each index i, 
// it initializes a variable product = 1 and then runs another loop through the entire array.
// If the current inner index j is not equal to i, it multiplies nums[j] with product. 
// After finishing the inner loop, it stores the computed product in productArr[i]. 
// This way, for every element, you calculate the product of all other elements manually. 
// The logic is correct, but since it uses two nested loops, 
// the time complexity is O(n²), which is not optimal for large inputs.

import java.util.Arrays;

public class BruteForce{

   public static int[] productExceptSelf(int[] nums) {
      int productArr[] = new int[nums.length];

      for(int i=0; i<nums.length; i++){
        int product = 1;
        for(int j=0; j<nums.length; j++){
            if(i != j){
                product *= nums[j];
                productArr[i] = product;
            }
        }
      }   
      return productArr;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int result[] = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}