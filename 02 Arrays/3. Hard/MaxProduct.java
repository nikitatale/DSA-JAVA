public class MaxProduct{

    public static int maxProduct(int nums[]){
      int currProduct = 1;
      int maxProduct = Integer.MIN_VALUE;

      for(int i=0; i<nums.length; i++){
         currProduct = 1;
         for(int j=i; j<nums.length; j++){
            currProduct *= nums[j];
          
          if(maxProduct < currProduct){
            maxProduct = currProduct;
         }
        
         }
        
      }
      return maxProduct;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        int product = maxProduct(nums);
        System.out.println("Largest product = " + product);
    }
}