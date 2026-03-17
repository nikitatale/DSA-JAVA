// Time - O(n^2)

public class DuplicateElement {

    public static void findDuplicates(int[] nums) {
                boolean isDuplicate = false;

        for(int i=0; i<nums.length; i++){
           for(int j=i+1; j<nums.length; j++){
               if(nums[i] == nums[j]){
                   System.out.print(nums[i] + " ");
                   isDuplicate = true;
               }
           }
        }
        if(!isDuplicate){
            System.out.print("No duplicate found");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 3, 6};
        findDuplicates(nums);
    }
}


// Time = O(n)

// if array modification allowed

// Arrays.sort(nums);

//  for(int i=1; i<nums.length; i++){
//            boolean isDuplicate = false;
//            if(nums[i] == nums[i-1]){
//                isDuplicate = true;
//            }

//            if(isDuplicate){
//                return nums[i];
//            }
//        }
//        return -1;