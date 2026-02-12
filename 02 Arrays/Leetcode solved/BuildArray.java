
import java.util.Arrays;

public class BuildArray{
     public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

         for(int i=0; i<nums.length; i++){
             int intialValue = nums[i];
             int indexValue = nums[intialValue];
             ans[i] = indexValue;
         }
         return ans;
    }

    public static void main(String[] args){
        int nums[] = {0,2,1,5,3,4};
        BuildArray sc = new BuildArray();
        int number[] = sc.buildArray(nums);
        System.out.print(Arrays.toString(number));
    }
}