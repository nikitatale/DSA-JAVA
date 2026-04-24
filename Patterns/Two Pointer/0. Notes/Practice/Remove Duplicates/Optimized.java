// NOT WORKS FOR UNSORTED ARRAY
// TIME - O(n)
// SPACE - O(1)


// for Sorted + Unsorted we can use HashSet Approach time O(n) and space O(n)

public class Optimized{

    public static int removeDuplicates(int nums[]){
        if(nums.length == 0) return 0;
        
        int slow = 0;
        for(int fast=1; fast<nums.length; fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 4, 5, 5};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
}