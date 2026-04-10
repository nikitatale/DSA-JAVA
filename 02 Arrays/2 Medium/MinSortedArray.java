// Time Complexity = O(log n)
// Space Complexity = O(1)


public class MinSortedArray{

        public static  int findMin(int[] nums) {
        int start = 0, end = nums.length-1;

        while(start < end){
           int mid = start + (end - start) / 2;

            // right side sorted so end becomes mid

             if(nums[mid] <= nums[end]){
             end = mid;
           } else {
             start = mid + 1;
           }
        }

        return nums[start];
    }

    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        int min = findMin(nums);
        System.out.println("Minimum element = " + min);
    }
}