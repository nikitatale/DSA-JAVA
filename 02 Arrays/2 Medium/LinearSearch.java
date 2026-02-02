public class LinearSearch{
    
    public static void searchNum(int nums[], int target){
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                System.out.println(target + " found at index " + i);
                return;
            } 
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
       int nums[] = { 34, 56, 21, 78, 49, 90};
       int target = 78;
       searchNum(nums, target);  
    }
}