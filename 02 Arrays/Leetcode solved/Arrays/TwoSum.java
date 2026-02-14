// numbers = [2,7,11,15], 
// target = 9
// Output: [1,2]
// Two pointer logic correct
// 1-based indexing correct
// Break used correctly
// O(n) solution

// Since the array is sorted, I used the two-pointer technique.
// I initialized one pointer at the beginning and one at the end.
// If the sum was smaller than the target, I moved the left pointer forward to increase the sum.
// If the sum was larger, I moved the right pointer backward to decrease it.
// Once I found the target sum, I returned the 1-based indices as required.


import java.util.Arrays;

public class TwoSum{

    public static int[] twoSum(int numbers[], int target) {
    int arr[] = new int[2];
    int start = 0, end = numbers.length-1;
    while (start <= end) {
      int sum = numbers[start] + numbers[end];  
      if(sum == target){
        arr[0] = start+1; //by adding +1 we can achieve 1-based indexing
        arr[1] = end+1;
        break;
      } else if(sum < target){
        start++;
      } else{
        end--;
      }
   
    }
    return arr;      
 }
    public static void main(String[] args){
     int[] numbers = {2,7,11,15};
     int target = 9;
     int result[] = twoSum(numbers, target);
     System.out.println(Arrays.toString(result));
        
    }
}