// Stair Case Approach - Time - O(n + m)
// Array is sorted so we use Staircase Search (or Search in Sorted Matrix) technique
// we start searching from top-right corner - start = 0, end = nums[0].length-1;
// compare each element with key
// if element match with key then we simply return index
// if nums[start][end] > key so we have to do end-- (move left) because all the value after end is larger 
// if nums[start][end] < key so we have to do start++ (move bottom) because all the value after start is larger

// rows traverse - m steps
// col traverse per row = n steps
// total steps = m*n (brute force)

// in each step row ++ or col --
// row move = m
// col move = n
// total moves = m + n (staircase)

// not skipping elementsb just avoid unnecessary elements because matrx is sorted

public class Optimized{

    public static void search(int nums[][], int key) {

        boolean found = false;
        int start = 0, end = nums[0].length-1;


        while(start < nums.length && end >= 0){
           if(nums[start][end] == key){
            System.out.println("(" + start + "," + end + ")");
            found = true;
            break;
           }

           else if(nums[start][end] > key){
            end--;
           } else{
            start++;
           }
        }

        if(!found){
            System.out.println("Key is not found!");
        }
    }

    public static void main(String[] args) {
        int nums[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},  
        };

       int key = 99;
       search(nums, key);
    }
}