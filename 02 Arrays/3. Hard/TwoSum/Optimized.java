// We can use Two Pointer that works when array is sorted 
// after finding a valid pair we break the consition.
// Time complexity - O(n) if array is sorted

import java.util.Arrays;

public class Optimized{

     public static int[] pair(int nums[], int target){
          int newArr[] = new int[2];

         int start = 0, end = nums.length-1;
         while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == target){
                newArr[0] = start;
                newArr[1] = end;
                break;
            } else if(sum > target){
                end--;
            } else {
                start++;
            }
         }
         return newArr;
     }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int arr[] = pair(nums, target);
        System.out.println(Arrays.toString(arr));
    }
}