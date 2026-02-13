public class MajorityElement{
    public static int linear(int nums[]){
        int count = 0;
        int number = 0;
        for(int i=0; i<nums.length; i++){
          if(count == 0 && number != nums[i]){
              number = nums[i];
              count++;
          } else {
              count = (number == nums[i] ? count+1 : count-1);
          }

      }
      return number;
    }

    public static void main(String[] args){
     int nums[] = {3,2,3};
     int number =  linear(nums);
     System.out.print(number);
    }
}