public class PairSum{
    
        public static boolean isPair(int nums[], int target){
        int start = 0;
        int end = nums.length-1;

        while (start < end){
            int sum = nums[start] + nums[end];
            if(sum == target){
                System.out.println(nums[start] + ", " + nums[end]);
                return true;
            }
            else if(sum < target){
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 4, 5, 6};
        int target = 8;
        boolean res = isPair(nums, target);
        System.out.println(res);
    }
}