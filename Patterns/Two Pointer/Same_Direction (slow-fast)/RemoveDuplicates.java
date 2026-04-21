




import java.util.Arrays;

public class RemoveDuplicates{
    
    public static void removeDuplicates(int nums[]){
        int slow = 0;
        for(int fast=1; fast<=nums.length-1; fast++){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];   // overwrite
            }
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 4, 5, 5};  // sorted array
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}