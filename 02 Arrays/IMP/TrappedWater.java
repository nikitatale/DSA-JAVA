// To trapped water needs boundries from both sides
// Water level at an index is limited by the smaller of the two boundaries, because water cannot rise above the shorter boundary.
// trapped water will be subtracting the current height from water level
// Time Complexity : O(n) bacause it depeneds on array size that runs n times 
// Space Complexity : O(n) (because of leftMax and rightMax arrays)

public class TrappedWater{
    public static int trappedWater(int heights[]){
       // calculate left max boundary
        int n = heights.length;
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(heights[i], leftMax[i-1]);
        }

        //calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //Loop
        for(int i=0; i<n; i++){
            //calculate water level - min of left max and right max
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // calculate trappedwater minus current bar height from ground water level
            trappedWater += waterLevel - heights[i];
        }
        return trappedWater;
    }

    public static void main(String[] args){
        int heights[] = {4,2,0,3,2,5};
        System.out.println("Trapped Water = " + trappedWater(heights));

    }
}