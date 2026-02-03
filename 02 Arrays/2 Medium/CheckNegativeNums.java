public class CheckNegativeNums{

    public static boolean checkNegativeNums(int nums[]){
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 2, -1, 7, -2, 9, -4, 6};
        boolean result = checkNegativeNums(nums);

        if(!result){
            System.out.println("No negative numbers found!");
        } else{
            System.out.println("Negative Numbers founds!");
        }
    }
}