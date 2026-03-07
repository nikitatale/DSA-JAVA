// Find the next lexicographical permutation of an array of numbers.
// If the array is the largest permutation, return the smallest (sorted) one.
// Traverse from right to left to find the pivot (first number smaller than its next).
// If no pivot, reverse/sort the array.
// Swap pivot with the next larger number on its right.
// Reverse the subarray after the pivot.

// Time Complexity: O(n) – one pass to find pivot + one pass to reverse.
// Space Complexity: O(1) – in-place modification.


import java.util.Arrays;

public class Optimized{

        public static void nextPermutation(int nums[]){
        int pivot = -1; // if there is no pivot then value will be -1

        //find pivot element
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        //if pivot still -1 then reverse array
        if(pivot == -1){
            Arrays.sort(nums);
        }

        // find next larger element than pivot
        for(int j=nums.length-1; j>=pivot; j--){
            if(nums[j] > nums[pivot]){
                int temp = nums[pivot];
                nums[pivot] = nums[j];
                nums[j] = temp;
                break;
            }
        }

        // reverse element from pivot + 1 to nums.length-1

        int i = pivot + 1;
        int j = nums.length-1;
        while (i <= j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;

            i++;
            j--;
        }
    }
    
     public static void main(String[] args){
        int nums[] = {1,2,3,5,4};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}