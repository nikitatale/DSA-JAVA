
import java.util.Arrays;

public class PrefixSum{
    public static int[] solution(int nums[]){ 
        int prefix[] = new int[nums.length]; 
        prefix[0] = nums[0]; 
        for(int i=1; i<nums.length; i++){ 
            prefix[i] = nums[i] + prefix[i-1]; 
        } 
        
        return prefix; 
}


        public static void main(String[] args){ 
        int nums[] = {1,2,3,4}; 
        int res[] = solution(nums); 
        System.out.println(Arrays.toString(res)); }
}