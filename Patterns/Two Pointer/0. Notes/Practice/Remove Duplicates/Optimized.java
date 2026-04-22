
import java.util.Arrays;

public class Optimized{

    public static void removeDuplicates(int nums[]){
        int slow = 0;
        for(int fast=1; fast<nums.length; fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 4, 5, 5};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}