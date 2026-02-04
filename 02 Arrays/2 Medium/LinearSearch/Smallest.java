public class Smallest{

    public static int smallestNum(int nums[]){
        int smallestNum = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(smallestNum > nums[i]){
                smallestNum = nums[i];
            }
        }

        return smallestNum;
    } 

    public static void main(String[] args) {
        int nums[] = { 34, 56, 21, 78, 49, 90};
        int smallestNum = smallestNum(nums);
        System.out.println("Smallest Number of an array = " + smallestNum);
    }
}