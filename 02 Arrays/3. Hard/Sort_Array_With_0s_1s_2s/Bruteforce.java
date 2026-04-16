// I'll first sort the array using built-in sort
// Time: O(n log n)


import java.util.Arrays;

public class Bruteforce{

    public static void sortArr(int nums[]){
       Arrays.sort(nums);
    }

    public static void main(String[] args) {
        int nums[] = {2, 0, 1, 1, 0, 2, 2, 0, 0, 1, 0};
        sortArr(nums);
        System.out.println(Arrays.toString(nums));
    }
}