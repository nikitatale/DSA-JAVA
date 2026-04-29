// Time - O(n)
// Space - O(1)


public class BruteForce{

     public static int search(int nums[], int target){
       for(int i=0; i<nums.length; i++){
           if(nums[i] == target){
               return i;
           }
       }
       return -1;
    }

    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        int res = search(nums, target);
        System.out.println(res);
    }
}