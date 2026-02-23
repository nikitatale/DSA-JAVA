// In this problem we use 3 Nested loops - Loops run n times - Time complexity O(n^3)
// Outer loop ( i loop ) runs n times ( n = nums.length )
// Second loop ( j loop ) runs n times for each i = 0 | i = 1 n-1 times | i = 2 n-2 times | last 1 time 
// total iteration  n(n + 1) / 2 -> O(n^2)
// Third loop ( k loop ) prints subarray elements. In worst case start = 0 & end = n-1 k runs n times = O(n)
// Outer two loops O(n^2) * O(n) = O(n^3)
// Outer two loops decides number of subarrays
// Third loop prints elements inside each subarray

public class PrintSubArrays{
    
    public static void printSubArrays(int nums[]){
        int totalSubArrays = 0;
        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=i; j<nums.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(nums[k] + " ");
                }
                totalSubArrays++;
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Total Sub Arrays = " + totalSubArrays);
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        printSubArrays(nums);

    }
}