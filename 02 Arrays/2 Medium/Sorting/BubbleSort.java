// Sorting is a way to Arrange elements in particular order - ascending or descending
// In bubble sort we place large element at the end of an array by comparing & swapping with adjacent element
// outer loops runs for number of turns that runs in n-1 times
// inner loop is actual index runs in n-1 times, n-2 times but in big O we ignore constants
// Time Complexity - O(n^2);

public class BubbleSort{
    
    public static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }

    public static void bubbleSort(int nums[]){
        // outer loop for turns
        for(int i=0; i<nums.length-1; i++){
            // inner loop for comparing adjacent element pairs
            for(int j=0; j<nums.length-i-1; j++){
                // compare and swap adjacent elements
                if(nums[j] > nums[j+1]){
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        int nums[] = {2, 5, 1, 3, 4};
        printArray(nums);
        bubbleSort(nums);
        printArray(nums);
    }
}