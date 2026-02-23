// when nums[mid] == target
// element found
// store it 
// but may be element exists in left
// so move left 


public class FirstOccurrence{

    public static int findFirstOccurrence(int nums[], int target){
         int start = 0, end = nums.length-1; 
          int value = -1;
         
         while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                value = mid;
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
         }
         return value;
    }

    public static void main(String[] args) {
        int nums[] = {3, 4, 6, 7, 14, 14, 19};
        int target = 14;
        int index = findFirstOccurrence(nums, target);
        System.out.println("Index of first occurrence = " + index);
    }
}



