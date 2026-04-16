// Time → O(n)
// Space → O(1)


import java.util.Arrays;

public class IndexMarking1D{

     public static int[] repeatMissing(int nums[]) {
         int n = nums.length;
         int repeat = -1;
         int missing = -1;

         // repeat
         for(int i=0; i<n; i++){
            int value = Math.abs(nums[i]);   // handle negative

            int index = value - 1;   // map value → index

            if(nums[index] < 0){
                repeat = value;      // already visited → repeat
            } else{ 
                nums[index] = -nums[index];   // mark as visited (negative)
            }
         }

         // missing
         for(int i=0; i<n; i++){
            if(nums[i] > 0){
                missing = i + 1;    // index + 1 → missing
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