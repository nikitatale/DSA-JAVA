// Binary search only works on sorted array. at every step it compares target with mid
// initially we have n elements
// after first comparison half of them are eleminated - n / 2
// after second comparison again half of them are eleminated - n / 4 ... n / 8

//Time Complexity - O(log n) time
//Space Complexity - O(1) space



public class BinarySearch{

    public static int binarySearch(int nums[], int target){
        int start = 0, end = nums.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            } 

            if(nums[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int nums[] = {2, 3, 4, 7, 8, 11, 15};
        int target = 11;
        int index = binarySearch(nums, target);

        if(index == -1){
            System.out.println("Target not present in an array");
        } else{
            System.out.println("Target present at index " + index);
        }
    }
}