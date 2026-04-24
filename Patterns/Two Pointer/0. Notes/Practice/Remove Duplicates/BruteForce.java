// WORKS FOR SORTED AND UNSORTED

// Time - O(n²)
// Space - O(1)

public class BruteForce {

    public static int removeDuplicate(int nums[]){
       if(nums.length == 0) return 0;

       int k = 0;
       for(int i=0; i<nums.length; i++){
           boolean isDuplicate = false;

           for(int j=0; j<i; j++){
               if(nums[i] == nums[j]){
                   isDuplicate = true;
                   break;
               }
           }

           if(!isDuplicate){
               nums[k] = nums[i];
               k++;
           }
       }
       return k;
    }


    public static void main(String[] args){
      int nums[] = {3, 3, 2, 4, 5, 2};
      int res = removeDuplicate(nums);
      System.out.println(res);
    }
}