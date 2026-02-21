//BRUTE FORCE APPROACH - O(n^2)
// an array of heights where each element represents a vertical line on the x-axis.
// We must choose two lines such that together with the x-axis they form a container that can hold the maximum amount of water. 
// The area of water stored depends on the distance between the two lines (width = j - i) and the smaller height of the two lines
// (because water cannot exceed the shorter line). So the formula is:
// Area = (j - i) × min(height[i], height[j]).

// checks every possible pair of lines using two nested loops. For each pair (i, j), it calculates the width as (j - i), 
// finds the minimum height between height[i] and height[j], then calculates the area using width × minimum height. 
// It keeps updating the maximum area found using Math.max(). After checking all possible pairs, it returns the maximum water area. 
// This approach is correct but has a time complexity of O(n²) because it compares every pair of elements.

public class BruteForce{
    public static int maxArea(int[] height) {
        int maxAmount = 0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int width = j-i;
                int heightLevel = Math.min(height[i], height[j]);
                int area = width*heightLevel;
                maxAmount = Math.max(maxAmount, area);
            }
        }
        return maxAmount;
    }

    public static void main (String[] args){
        int height[] = {1,8,6,2,5,4,8,3,7};
        int waterAmount = maxArea(height);
        System.out.println("the max area of water (blue section) the container can contain is " + waterAmount);  
    }
}