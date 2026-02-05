public class LastOccurrence{

    public static int lastOccurrence(int nums[], int target){
        for(int i=nums.length-1; i>0; i--){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    } 

    public static void main(String[] args) {
        int nums[] = {1, 1, 18, 5, 1, 2};
        int target = 1;
        int num = lastOccurrence(nums, target);
        System.out.println(num);
    }
}