// We run loop to perform n operations so time complexity is same O(n)

public class Largest{
    
    public static int largestNum(int nums[]){
        int largestNum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(largestNum < nums[i]){
                largestNum = nums[i];
            }
        }

        return largestNum;
    }
    
    public static void main(String[] args) {
        int nums[] = { 45, 32, 89, 67, 14};
        int largeNum = largestNum(nums);
        System.out.println("Largest Number of an array = " + largeNum);
    }
}