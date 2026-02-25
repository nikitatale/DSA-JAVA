// Peak cannot be at index 0
// Peak cannot be at last index
// start from i=1 to i<= nums.length-2 check until second last element skipping last element 
// Time - O(n) 
// Space - O(1) 


public class BruteForce{
    public static int peakIndex(int nums[]){
        for(int i=1; i<=nums.length-2; i++){
            if(nums[i-1] < nums[i] && nums[i+1] < nums[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int nums[] = {0,10,5,2};
        int index =  peakIndex(nums);
        System.out.println("Peak Index in a Mountain Array = " + index);
    }
}