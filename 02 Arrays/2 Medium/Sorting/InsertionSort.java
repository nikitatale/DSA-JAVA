// Insertion sort - pick one element from unsorted part and place at the sorted part
// assume left part is sorted and right part is unsorted 
// pick element compare with sorted element if current element is greater than sorted element shift right
// and place current element in right position
// Time complexity - O(n^2) 

public class InsertionSort{

      public static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }

    public static void insertionSort(int nums[]) {
        // assume 0th index element is sorted and loop runs from 1st index
        for(int i=1; i<nums.length; i++){
            // current = 1
            int current = nums[i];
            // j=0 last index of sorted part
            int j= i-1;

            // runs until sorted element is greater than current element shift right
            while(j >= 0 && nums[j] > current){
                // shift element one step right
                nums[j+1] = nums[j];
                // move left to check 
                j--;
            }
            // place current in empty spot created after shifting 
            nums[j+1] = current;
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 5, 1, 3, 4};
        printArray(nums);
        insertionSort(nums);
        printArray(nums);
    }
}