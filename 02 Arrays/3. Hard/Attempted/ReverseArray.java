
import java.util.Arrays;

public class ReverseArray{
    public static void reverseArray(int nums[]) {
        int start = 0, end = nums.length-1;

        while (start <= end) { 
           int temp = nums[end];
           nums[end] = nums[start];
           nums[start] = temp;

           start++;
           end--;
        }
    } 
    
    public static void main(String[] args){
        int nums[] = { 2, 3, 4, 5, 8, 11, 15};
        System.out.println("Original Array = " + Arrays.toString(nums));
        reverseArray(nums);
        System.out.println("Reversed Array = " + Arrays.toString(nums));

    }
}