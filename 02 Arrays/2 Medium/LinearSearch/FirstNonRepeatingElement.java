//Time complexity - O(n²)
//space complexity - O(1)


public class FirstNonRepeatingElement{
    
    public static int firstNonRepeatingElement(int nums[]){
         for(int i=0; i<nums.length; i++){
            boolean isNonRepeated = true;

            for(int j=0; j<nums.length; j++){
                if(i != j && nums[i] == nums[j]){
                  isNonRepeated = false;  
                  break;
                } 
            }
            if(isNonRepeated){
                return nums[i];
            }
         }
         return -1;
    }

    public static void main(String[] args) {
        int nums[] = {34, 2, 1, 5, 67, 1, 89};
        int element = firstNonRepeatingElement(nums);
        if(element != -1){
            System.out.println(element + " is first non repeating element in array");
        } else{
            System.out.println("No non-repeating element found");
        }
    }
}