// Mountain array means:
// Strictly increasing
// Then strictly decreasing
// Only ONE peak

// ex [0, 10, 5, 2] = 1 is the peak index that 
// Peak cannot be at index 0
// Peak cannot be at last index
// Mountain array always has increasing then decreasing part

// Time → O(log n) (Binary Search)
// Space → O(1)


public class Optimize{

    public static  int peakIndexInMountainArray(int[] arr) {
        int start = 1, end = arr.length-2;
         while (start < end){
             int mid = start + (end - start) / 2;
             if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]){
                 return mid;
             } else if(arr[mid - 1] < arr[mid]){
                 start = mid + 1;
             } else {
                 end = mid - 1;
             }
         }
         return start;
    }

    public static void main(String[] args){
        int arr[] = { 0,10,5,2 };
        int index =  peakIndexInMountainArray(arr);
        System.out.println("Peak Index in a Mountain Array = " + index);
    }
}


// Optimized Slope Version
// Only compare arr[mid] and arr[mid+1]
// Shrink search space
// Eventually start == end → 


// while (start < end) {
//             int mid = start + (end - start) / 2;

//             if (arr[mid] < arr[mid + 1]) {
//                 start = mid + 1;   // go right
//             } else {
//                 end = mid;         // peak is here or left
//             }
//         }
//         return start;