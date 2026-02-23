// 2 Pointer Approach

// This optimized solution uses the two-pointer approach to solve the Container With Most Water problem in O(n) time. 
// Instead of checking all pairs, it starts with two pointers: one at the beginning (start = 0) and one 
// at the end (end = height.length - 1). In each step, it calculates the width as end - start, 
// finds the minimum of the two heights (since water level depends on the shorter line), and 
// computes the current water area. It updates the maximum area found so far using Math.max().
// Then, it moves the pointer that has the smaller height inward because increasing the smaller
//  height might increase the area, while moving the taller one cannot help since the area is limited 
//  by the shorter line. This continues until both pointers meet, ensuring all useful combinations are 
//  checked efficiently in linear time.

public class Optimize {

    public static int maxArea(int[] height) {
        int maxAmount = 0;
        int start = 0, end = height.length - 1;

        while (start < end) {
            int width = end - start;
            int heights = Math.min(height[start], height[end]);
            int currWater = width * heights;
            maxAmount = Math.max(maxAmount, currWater);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxAmount;
    }

    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int waterAmount = maxArea(height);
        System.out.println("the max area of water (blue section) the container can contain is " + waterAmount);
    }
}
