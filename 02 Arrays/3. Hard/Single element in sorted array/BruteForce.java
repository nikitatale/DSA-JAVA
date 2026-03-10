// Time Complexity - O(n^2)

public class BruteForce{
        public static int singleNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            boolean isSingle = true;
            for(int j=0; j<nums.length; j++){
                if( i != j && nums[i] == nums[j]){
                    isSingle = false;
                    break;
                }
            }
            if(isSingle){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int nums[] = {1,1,2,3,3,4,4,8,8};
        int number = singleNumber(nums);
        System.out.print(number);
    }
}