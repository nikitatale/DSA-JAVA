// Matrix size is n × n, so total elements = n², numbers should be from 1 to n².
// Flatten socho matrix ko (ya directly traverse karo), har number ka count check karo.
// Loop from 1 to n² (expected range).
// For each number i, count how many times it appears in the matrix.
// If count == 2 → repeating element, if count == 0 → missing element.
// Time complexity still O(n⁴) (because for each number you scan full matrix).

import java.util.Arrays;


public class BruteForce{
   
    public static int[] repeatMissing(int nums[][]) {
        int n = nums.length;
        int repeat = -1;
        int missing = -1;
        

        for(int num=1; num<=n*n; num++){
            int count = 0;
            for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[i][j] == num){
                  count++;
                }
            }
        } 

         if(count == 2){
            repeat = num;
         } else if(count == 0){
            missing = num;
         }

        }

        return new int[] {missing, repeat};
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