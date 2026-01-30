// Total Time Complexity
// O(n)
//because we have to check every element to find the largest.

// Space Complexity
// We only use one extra variable largest, regardless of array size.
// O(1)  (constant space)


public class MaxNum{

    public static int largestNum(int numbers[]){
       int largest = Integer.MIN_VALUE;
       
       for(int i=0; i<numbers.length; i++){
        if(largest < numbers[i]){
            largest = numbers[i];
        }
       }
       return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {10, 22, 76, 88, 45};
        System.out.println("Largest Number = " + largestNum(numbers));
    }
}