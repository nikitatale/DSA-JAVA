import java.util.Arrays;

public class ReverseArray{

    public static void reverseArray(int nums[]){
        int first = 0, last = nums.length-1;

        while (first < last) { 
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            first++;
            last--; 
        }
    }

    public static void main(String[] args) {
        int nums[] = { 23, 36, 42, 51, 66};
        reverseArray(nums);

       System.out.println(Arrays.toString(nums));
    }
}