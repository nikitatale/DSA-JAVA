// Originally sorted → [0,1,2,4,5,6,7]
// Then rotated at pivot → 7

// In a rotated sorted array:
// At least one half is always sorted.
// Modified Binary Search
// At least one half is always sorted
// Identify sorted half
// Check if target lies in sorted half
// Eliminate the other half
// Use <= to handle edge cases

// Time: O(log n)
// Space: O(1)

// Because we eliminate half each time.

public class SearchRotatedSortedArray{
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            } 
             if(nums[start] <= nums[mid]){
               if(nums[start] <= target && target < nums[mid]){
                  end = mid - 1;
               } else {
                 start = mid + 1;
               }
            } else {
               if(nums[mid] < target && target <= nums[end]){
                  start = mid + 1;
               } else {
                  end = mid - 1;
               }
            }
        }
        return -1;
    }

 public static void main(String[] args){
        int nums[] = { 4,5,6,7,0,1,2 };
        int target = 0;
        int index = search(nums, target);
        System.out.println(index);
    }
}