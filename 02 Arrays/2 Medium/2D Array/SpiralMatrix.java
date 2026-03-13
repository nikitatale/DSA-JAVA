// Time Complexity - O(n^2)


public class SpiralMatrix{
    
    public static void printSpiral(int nums[][]){
        int startRow = 0;
        int endRow = nums.length-1;
        int startCol = 0;
        int endCol = nums[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            // top
            for(int i=startCol; i<=endCol; i++){
                System.out.print(nums[startRow][i] + " ");
            }

            // right
            for(int j=startRow+1; j<=endRow; j++){
                System.out.print(nums[j][endCol] + " ");
            }

            //bottom
            for(int i=endCol-1; i>=startCol; i--){
                if(startRow == endRow) break;
                System.out.print(nums[endRow][i] + " ");
            }

            //left
            for(int j=endRow-1; j>=startRow+1; j--){
                if(startCol == endCol) break;
                System.out.print(nums[j][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        System.out.println(" ");
    }
    
    
    public static void main(String[] args) {
         int nums[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printSpiral(nums);
    }
}