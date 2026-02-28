// 2D arary - Array of Array
// ROW + COLUMNS


public class PrintArray{

    public static void printArr(int nums[][]){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j] + " ");
            }

            System.err.println(" ");
        }
    }

    public static void main(String[] args) {
        int nums[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printArr(nums);
    }
}