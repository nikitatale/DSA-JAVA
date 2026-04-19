//  Time = O(log n)
//  Space = O(1)


public class Optimize{

   public static int singleNumber(int[] nums) {
           // if array has 1 element
        if(nums.length == 1) return nums[0];

       int start = 0, end = nums.length-1;

       while (start <= end){
           int mid = start + (end - start) / 2;

           // when mid is starting
           if(mid == 0 && nums[0] != nums[1]){
               return nums[mid];
           }

           // when mid is ending
           if(mid == nums.length-1 && nums[nums.length-1] != nums[nums.length-2]){
               return nums[mid];
           }

           // when my mid is not match with previous and next element
           if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]) return nums[mid];

           if(mid % 2 == 0){  //even
               if(nums[mid-1] == nums[mid]){ // left
                   end = mid - 1;
               } else {  // right
                   start = mid + 1;
               }
           } else {  //odd
               if(nums[mid] == nums[mid - 1]){ // right
                   start = mid + 1;
               } else {  // left
                   end = mid - 1;
               }
           }
       }
       return -1;
   }

    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4,8,8};
        int number = singleNumber(nums);
        System.out.print(number);
    }
}