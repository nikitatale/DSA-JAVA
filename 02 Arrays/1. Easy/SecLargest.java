public class SecLargest {
    
    public static void secondLargestNum(int nums[]) {
       int largest = Integer.MIN_VALUE;
       int secLarge = Integer.MIN_VALUE;

       for(int i=0; i<nums.length; i++){
        if(largest < nums[i]){
            secLarge = largest;
            largest = nums[i];
        } else if(nums[i] > secLarge && nums[i] != largest){
            secLarge = nums[i];
        }
       }

       System.out.println("Second Largest Number = " + secLarge);
    }
    
    public static void main(String[] args) {
        int nums[] = { 2, 4, 1, 5, 6, 3, 8, 10, 9};
        secondLargestNum(nums);
    }
}