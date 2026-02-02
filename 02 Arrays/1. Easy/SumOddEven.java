public class SumOddEven {
    
    public static void sumOddEven(int nums[]){
        int evenSum = 0;
        int oddSum = 0;

        for(int i=0; i<nums.length; i++){
           if(nums[i] % 2 == 0){
              evenSum += nums[i];
           } else{
              oddSum += nums[i];
           }
        }

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum " + oddSum );
    }
    
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 2, 7, 8 };
        sumOddEven(nums);
    }
}
