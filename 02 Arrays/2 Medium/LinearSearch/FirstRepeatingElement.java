//Time complexity - O(n²)
//space complexity - O(1)

public class FirstRepeatingElement{
    
    public static int repeatedElement(int nums[]){
       for(int i=0; i<nums.length; i++){
          for(int j=i+1; j<nums.length; j++){
            if(nums[i] == nums[j]){
                return nums[i];
            }
          }
       }
       return -1;
    }

    
    public static void main(String[] args) {
        int nums[] = { 34, 2, 1, 1, 67, 67, 89};
        int element = repeatedElement(nums);
        System.out.println(element + " is first repeating element in array");
    }
}