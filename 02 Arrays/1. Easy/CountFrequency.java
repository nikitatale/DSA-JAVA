public class CountFrequency{
   
    public static void countFrequency(int nums[], int x){
        int count = 0; 
        for(int i=0; i<nums.length; i++){
           if(x == nums[i]){
            count++;
           }
         }
         System.out.println(x + " number appears " + count + " times");
    }
   
    public static void main(String[] args){
      int nums[] = { 3, 4, 5, 2, 1, 9, 3, 8, 10, 3};
      int x = 3;
      countFrequency(nums, x);
    }
}