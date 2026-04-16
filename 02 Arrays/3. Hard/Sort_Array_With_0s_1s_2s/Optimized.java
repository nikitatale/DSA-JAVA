// Count 0s, 1s, 2s
// Overwrite array
// sorted in 2 Pass
// Time: O(n)


import java.util.Arrays;

public class Optimized{

     public static void sortArr(int nums[]){
        int count0 = 0, count1 = 0, count2 = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count0++;
            } else if(nums[i] == 1){
                count1++;
            } else {
                count2++;
            }
        }

        int idx = 0;
        for(int i=0; i<count0; i++){
            nums[idx] = 0;
            idx++;
        }

        for(int i=0; i<count1; i++){
            nums[idx] = 1;
            idx++;
        }

        for(int i=0; i<count2; i++){
            nums[idx] = 2;
            idx++;
        }
     }

    public static void main(String[] args) {
        int nums[] = {2, 0, 1, 1, 0, 2, 2, 0, 0, 1, 0};
        sortArr(nums);
        System.out.println(Arrays.toString(nums));
    }
}