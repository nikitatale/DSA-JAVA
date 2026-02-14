
import java.util.Arrays;

public class TwoSum{

    public static int[] twoSum(int numbers[], int target) {
    int arr[] = new int[2];
    int start = 0, end = numbers.length-1;
    while (start <= end) {
      int sum = numbers[start] + numbers[end];  
      if(sum == target){
        arr[0] = start+1;
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