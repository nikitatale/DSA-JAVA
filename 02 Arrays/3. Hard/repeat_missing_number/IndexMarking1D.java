// We are given an array of size n containing numbers from 1 to n, where one number is missing and one is repeated.
// Instead of iterating over the array, we iterate from 1 to n (expected range).
// For each number i, we count how many times it appears in the array.
// If the count is 2, that number is the repeating element.
// If the count is 0, that number is the missing element.
// This approach uses nested loops, so the time complexity is O(n²).


import java.util.Arrays;

public class IndexMarking1D{

     public static int[] repeatMissing(int nums[]) {
         int n = nums.length;
         int repeat = -1;
         int missing = -1;

         for(int num=1; num<=n; num++){
            int count = 0;

            for(int i=0; i<n; i++){
                if(nums[i] == num){
                  count++;
                }
            }

            if(count == 2){
                repeat = num;
            } else if(count == 0){
                missing = num;
            }
         }

         return new int[]{missing, repeat};
     }

    public static void main(String[] args) {
        int nums[] = {1, 4, 4, 2, 5};
        int res[] = repeatMissing(nums);
        System.out.println(Arrays.toString(res));
    }
}