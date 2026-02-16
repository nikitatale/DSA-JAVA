// The index in an array where the sum of all elements to its left equals the sum of all elements to its right.
// 1 + 7 + 3 = 11 (left)
// 5 + 6 = 11 (right)
// Index 3 is pivot index

// first loop - calculate totalSum of array element
// second loop - maintain left sum 
// calculate right sum dynamically - rightSum = totalSum - leftSum - nums[i]
// compare both sum if yes return i index & update left sum
// if not same return -1

public class PivotIndex{
     public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;

        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];
        }

        for(int i=0; i<nums.length; i++){
            rightSum = totalSum - leftSum - nums[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args){
        int nums[] = {1,7,3,6,5,6};
        PivotIndex sc = new PivotIndex();
        int index = sc.pivotIndex(nums);
        System.out.print("Pivot Index = " + index);
    }
}