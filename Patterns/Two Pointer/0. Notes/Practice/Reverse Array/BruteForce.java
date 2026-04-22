// creating a new array and filling it in reverse order

// Time - O(n)
// Space O(n)   using extra memory → not optimal.


import java.util.Arrays;

public class BruteForce{

    public static int[] reverseArr(int nums[]){
       int newArr[] = new int[nums.length];

       for(int i=0; i<nums.length; i++){
        newArr[i] = nums[nums.length-1-i];
       }

       return newArr;
    }

    public static void main(String args[]){
        int nums[] = {3, 1, 4, 5, 6};
        int res[] = reverseArr(nums);
        System.out.println(Arrays.toString(res));
    }
}