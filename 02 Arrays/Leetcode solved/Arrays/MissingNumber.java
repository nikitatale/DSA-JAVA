
import java.util.Arrays;

class MissingNumber {
    public static int missingNumber(int[] nums) {
      Arrays.sort(nums);
       int count = 0;
       for(int i=0; i<nums.length; i++){
           if(count == nums[i]){
               count++;
           } else {
              return count;
           }
       }
       return count;
    }

    public static void main(String[] args){
        int nums[] = {3, 0, 1};
        int number = missingNumber(nums);
        System.out.println(number);
    }
}