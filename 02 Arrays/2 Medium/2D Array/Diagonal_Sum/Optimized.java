// Time Complexity - O(n)

public class Optimized{
    
    public static void diagonalSum(int nums[][]){
       int sum = 0;

       for(int i=0; i<nums.length; i++){
        sum += nums[i][i]; // primary diagonal

        if(i != nums.length-1-i){
            sum += nums[i][nums.length-1-i]; // secondary diagonal
        }
    }

    System.out.println("Diagonal Sum = " + sum);
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