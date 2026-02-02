public class AlternateNum{
    
    public static void printAlternateNum(int nums[]){
         for(int i=0; i<nums.length; i= i+2){
            System.out.print(nums[i] + " ");
         }
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        printAlternateNum(nums);
    }
}