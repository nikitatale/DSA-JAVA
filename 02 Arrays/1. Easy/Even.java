// without using % check even 

// ( nums[i] & 1 ) == 0   - binary representation


public class Even{
      public static int solution(int nums[]){
       int count = 0;

       for(int i=0; i<nums.length; i++){
           if((nums[i] & 1) == 0){
               count++;
           }
       }

       return count;
    }


    public static void main(String[] args){
         int nums[] = {1,2,3,4,6};
         int res = solution(nums);
         System.out.println(res);
    }
}