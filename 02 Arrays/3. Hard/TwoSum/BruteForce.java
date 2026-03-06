// Return pair in sorted array with target sum 
// find out the pair whose sum equals to the given target
// ex. index 0 & 1 = 2 + 7 = 9

// Time Complexity = O(n^2)

import java.util.Arrays;

public class BruteForce{

 public static int[] pair(int nums[], int target){
     int newArr[] = new int[2];

     for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums[i] + nums[j] == target){
                newArr[0] = i;
                newArr[1] = j;
            }
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