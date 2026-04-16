// Same time complexity with Hashset but better space optimization
// O(n²), space O(1) ⭐ BEST

// Treat the matrix as a flattened array of size n² and map each value to an index using (value - 1).
// Convert that index to (row, col) and use it to mark visited by making the value negative.
// If the mapped cell is already negative, it means the number is repeating.
// After marking, traverse the matrix again to find a positive cell, which indicates the missing number.
// Convert (row, col) back to value using i * n + j + 1.
// This approach runs in O(n²) time and O(1) space, making it more space-efficient than hashing.


import java.util.Arrays;

public class IndexMarking2D{

    public static int[] repeatMissing(int nums[][]) {
        int n = nums.length;
        int repeat = -1;
        int missing = -1;

        // repeat
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int value = Math.abs(nums[i][j]);
                int row = (value - 1) / n;
                int col = (value - 1) % n;

                if(nums[row][col] < 0){
                    repeat = value;
                } else{
                    nums[row][col] = -nums[row][col];
                }
            }
        }

        // missing
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[i][j] > 0){
                    missing = i * n + j + 1;
                }
            }
        }
        
        return new int[]{missing, repeat}; 
    }

    public static void main(String[] args) {
        int nums[][] = {
            {1, 2, 3},
            {4, 6, 7},
            {8, 9, 9}
        };

     int res[] = repeatMissing(nums);
     System.out.println(Arrays.toString(res));
    }
}