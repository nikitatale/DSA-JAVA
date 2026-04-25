// Rotated sorted array me minimum pivot point par hota hai.
// mid > end ho to minimum right half me hota hai.
// mid < end ho to minimum left half (including mid) me hota hai.
// mid == end (duplicates) ho to direction unclear hoti hai, ambiguity reduce karne ke liye end-- karte hain.
// Jab start == end ho jata hai, wahi minimum element ka index hota hai.

// Time Complexity:
// Without duplicates → O(log n)
// With duplicates (worst case) → O(n)

// Space Complexity:
// O(1)



public class MinSortedHard{


    public static int findMin(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == nums[end]){
              end--;
            } 
            else if(nums[mid] > nums[end]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }

   public static void main(String[] args) {
       int nums[] = {2,2,2,0,2,2};
       int res = findMin(nums);
       System.out.println(res);
   }

}