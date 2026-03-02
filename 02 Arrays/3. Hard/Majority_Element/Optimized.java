// We used Sorting. In sorting array is converted into sorted elements asc or desc
// 3,3,4,2,3  = 2,3,3,3,4
// same elements placed in contiguous order so we can easily tracked frequency and check > n/2 and return element
// Time - O(n log n)


import java.util.Arrays;

public class Optimized{
        public static int majorityEle(int nums[]){
        Arrays.sort(nums);
        int frequency = 1, element = nums[0];
        for(int i=1; i<nums.length; i++){
           if(nums[i] == nums[i-1]){
               frequency++;
           } else {
               frequency = 1;
               element = nums[i];
           }
           if(frequency > nums.length / 2){
               return element;
           }
       }
       return -1;
    }

    public static void main(String[] args){
        int nums[] = {3,3,4,2,3};
        int res = majorityEle(nums);
        System.out.println(res);
    }
}