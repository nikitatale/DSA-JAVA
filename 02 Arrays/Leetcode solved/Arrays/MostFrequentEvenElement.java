// An integer array nums, return the most frequent even element.
// If there is a tie, return the smallest one. If there is no such element, return -1.
// Time Complexity - O(n^2)


public class MostFrequentEvenElement{
        public static int mostFrequentEvenElement(int nums[]){
        int ans = -1;
        int maxCount = 0;
        for(int i=0; i<nums.length; i++){
           if(nums[i] % 2 == 0){
               int count = 1;
              for(int j=i+1; j<nums.length; j++){
                  if(nums[i] == nums[j]){
                      count++;
                  }
              }
               if(count > maxCount){
                   maxCount = count;
                   ans = nums[i];
               } else if(count == maxCount){
                   ans = Math.min(ans, nums[i]);
               }
           }
       }
        return ans;
    }

    public static void main(String[] args){
        int nums[] = {0,1,2,2,4,4,1};
        int value = mostFrequentEvenElement(nums);
        System.out.print(value);
    }
}
