// Counting Sort - Non comparison sorting technique
// find large element
// create count array
// increase count of number 
// create sorted array
// Time Complexity - O(n + k)


public class CountingSort{

     public static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }

    public static void countingSort(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest + 1];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }

        int index = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                nums[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 5, 1, 3, 4};
        printArray(nums);
        countingSort(nums);
        printArray(nums);
    }
}