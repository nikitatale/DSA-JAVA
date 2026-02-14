
import java.util.Arrays;
public class removeElement{

    public static int validNums(int nums[], int target) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
             if(nums[i] != target){
                nums[count] = nums[i];
                 count++;
             } 
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int target = 3;

        int result = validNums(nums, target);
        System.out.println("Valid number count = " + result);
        System.out.println(Arrays.toString(nums));
    }
}