// check how many times target is compared with array elements
// count increase before if in java comparisons

public class TotalComparison{

    public static int totalComparisons(int nums[], int target){
        int start = 0, end = nums.length-1;
        int count = 0;

        while(start < end){
          int mid = (start + end) / 2;

          count++;
          if(nums[mid] == target){
            return count;
          } 

          count++;
          if(nums[mid] < target){
            start = mid + 1;
          } else{
            end = mid - 1;
          }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {2, 3, 4, 6, 9};
        int target = 6;
        int count = totalComparisons(nums, target);
        System.out.println("Total Comparisons = " + count);
    }
}