public class LargeAndSmall{

    public static void findLargeAndSmall(int nums[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(smallest > nums[i][j]){
                    smallest = nums[i][j];
                }
                if(largest < nums[i][j]){
                    largest = nums[i][j];
                }
            }
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }

    public static void main(String[] args) {
        int nums[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        findLargeAndSmall(nums);

    }
}