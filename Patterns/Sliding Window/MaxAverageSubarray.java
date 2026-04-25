// Pehle first k elements ka sum nikaalo (initial window).
// Usko maxSum maan lo.
// Fir window slide karo: next element add karo, previous remove karo.
// Har step pe maxSum update karo.
// End me maxSum / k hi maximum average hoga.

// Time Complexity: O(n)
// Space Complexity: O(1)


public class MaxAverageSubarray{

     public static double findMaxAverage(int[] nums, int k) {
       double sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

         double maxSum = sum;

        for(int i = k; i < nums.length; i++){
            sum += nums[i];
            sum -= nums[i - k];
            maxSum = Math.max(sum, maxSum);

        }
        double avg = maxSum / k;
        return avg;
    }

    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;
        double result = findMaxAverage(nums, k);
        System.out.println(result);
    }
}