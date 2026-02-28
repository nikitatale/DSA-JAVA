// Selection Sort - we peak a small element from unsorted array put is at the beginning
// assum the first 0th element is smallest element now compare smallest with rest of element if found make that element smallest
// One swap in one iteration 
// Time Complexity - O(n^2)


public class SelectionSort{

     public static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }

    public static void selectionSort(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            // assume current index is smallest element
            int smallest = i;
            for(int j=i+1; j<nums.length; j++){
                // compare smallest element with other next elements
                if(nums[smallest] > nums[j]){
                    // if found then update smallest
                    smallest = j;
                }
            }
             // one swap in one iteration 
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 5, 1, 3, 4};
        printArray(nums);
        selectionSort(nums);
        printArray(nums);
    }
}