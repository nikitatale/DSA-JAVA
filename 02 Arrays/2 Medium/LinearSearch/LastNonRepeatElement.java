public class LastNonRepeatElement {

    public static int nonRepeatedNum(int nums[]){
        for(int i=nums.length-1; i>=0; i--){
            boolean isNonRepeat = true;
            for(int j=nums.length-1; j>=0; j--){
                if(i != j && nums[i] == nums[j]){
                    isNonRepeat = false;
                    break;
                }
            }
            if(isNonRepeat){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int nums[] = {3, 4, 5, 2, 1, 3 };
        int res = nonRepeatedNum(nums);
        System.out.print(res);

    }
}