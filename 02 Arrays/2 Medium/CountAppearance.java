//Time Complexity - O(n)
//Space Complexity - O(1)

public class CountAppearance{

    public static int countAppearance(int nums[], int target){
       int count = 0;
       for(int i=0; i<nums.length; i++){
        if(target == nums[i]){
            count++;
        }
       }
       return count;
    }
    
    public static void main(String[] args) {
        int nums[] = { 23, 11, 78, 34, 11, 90, 67, 11};
        int target = 11;
        int count = countAppearance(nums, target);

        System.out.println(target + " appears " + count + " times");
    }
}