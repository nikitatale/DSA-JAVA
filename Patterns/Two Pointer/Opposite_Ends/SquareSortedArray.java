// Time - O(n)
// Space - O(n)  extra array used

// Use 2 Pointer Approach with opposite direction



import java.util.Arrays;

public class SquareSortedArray{
    
    public static int[] sortedSquares(int[] nums) {
        int newArr[] = new int[nums.length];

        int start = 0, end = nums.length-1;
        int idx = nums.length-1;

        while(start <= end){
            int startSq = nums[start] * nums[start];
            int endSq = nums[end] * nums[end];

            if(startSq > endSq){
                newArr[idx] = startSq;
                start++;
            } else{
                newArr[idx] = endSq;
                end--;
            }

            idx--;
        }
        return newArr;
    }
    
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        int res[] = sortedSquares(nums);
        System.out.println(Arrays.toString(res));

    }
}