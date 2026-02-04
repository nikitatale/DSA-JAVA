public class FirstOccurrence{

    public static int firstOccurrence(int nums[], int target){
       for(int i=0; i<nums.length; i++){
        if(target == nums[i]){
            return i;
        }
       }
      return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 9, 2};
        int target = 1;
        int index = firstOccurrence(nums, target);

        if(index == -1){
            System.out.println("Not Found!");
        } else{
            System.out.println(index + " is index of first occurrence of number " + target);
        }
    }
}