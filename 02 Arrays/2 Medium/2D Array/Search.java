public class Search{

    public static void search(int nums[][], int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(nums[i][j] == target){
                    System.out.println("Element place at (" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 7;
        search(nums, target);

    }
}