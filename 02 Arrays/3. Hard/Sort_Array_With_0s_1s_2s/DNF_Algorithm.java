
import java.util.Arrays;

// 3 pointers (low, mid, high)
// Single pass
// Time: O(n)
// Space: O(1)

// First I can sort the array using built-in sort (O(n log n)).
// Then I can optimize using counting since values are limited (O(n)).
// Finally, I can solve it optimally using Dutch National Flag algorithm in one pass with O(n) time and O(1) space


public class DNF_Algorithm{

    public static void sortArr(int nums[]){
        int low = 0, mid = 0, high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            } else if(nums[mid] == 1){
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 0, 1, 1, 0, 2, 2, 0, 0, 1, 0};
        sortArr(nums);
        System.out.println(Arrays.toString(nums));
    }
}