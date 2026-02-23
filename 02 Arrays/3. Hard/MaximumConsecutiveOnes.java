public class MaximumConsecutiveOnes{
     public static int arrayOps(int[] nums) {
        int currCount = 0;
        int maxCount = 0;
         for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
            currCount++;
            maxCount = Math.max(maxCount, currCount);
            } else{
                currCount = 0;
            }
         }
         return maxCount;
    }

    public static void main(String[] args) {
        int nums[] = {0};
        int number = arrayOps(nums);
        System.out.println(number);
    }
}