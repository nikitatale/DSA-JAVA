// Time - O(n^2)

public class BruteForce{

    public static void search(int nums[][], int key){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(nums[i][j] == key){
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
         int nums[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
        };

       int key = 33;
       search(nums, key);
    }
}