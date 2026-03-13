// Time Complexity - O(n^2)


public class BruteForce{
    
    public static void diagonalSum(int nums[][]){
       int sum = 0;
       for(int i=0; i<nums.length; i++){
        for(int j=0; j<nums[0].length; j++){
            if(i == j){
                sum += nums[i][j];
            } else if(i + j == nums.length-1){
                sum += nums[i][j];
            }
        }
       }

       System.out.println("Diagonal Sum = " + sum );
    }
    
    public static void main(String[] args) {
         int nums[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        diagonalSum(nums);
    }
}