//  Swap elements from start and end
//  we can reverse the array in-place using two pointers (start & end) and swapping

//  Time → O(n)
//  Space → O(1)


import java.util.Arrays;

public class Optimized{

    public static void reverseArr(int nums[]){
        int start = 0, end = nums.length-1;

        while (start < end) { 
           int temp = nums[start];
           nums[start] = nums[end];
           nums[end] = temp;
            
           start++;
           end--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {3, 1, 4, 5, 6};
        reverseArr(nums);
        System.out.println(Arrays.toString(nums));
    }
}