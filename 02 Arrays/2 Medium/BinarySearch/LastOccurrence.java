public class LastOccurrence{
    
    public static int lastOccurrence(int nums[], int target){
       int start = 0, end = nums.length-1;
       int value = -1;

       while(start <= end){
          int mid = (start + end) / 2;
          if(nums[mid] == target){
            value = mid;
            start = mid + 1;
          } else if(nums[mid] < target){
             start = mid + 1;
          } else {
             end = mid - 1;
          }
       }
       return value;
    }
    
    public static void main(String[] args){
       int nums[] = {13, 27, 35, 48, 48, 90};
       int target = 48;
       int index = lastOccurrence(nums, target);
       System.out.println("Index of last occurrence = " + index);
    }
}