// Special case to check majority element = floor [n / 2] times
// frquency count > nums.length / 2;
// ex. if arr size = 5; 5/2 = 2.5 floor value is 2 
// so case = count > 2 if array element exists more than count > 2 then return element as majority 
// if array does not exists count > 2 times then return -1
 
//Time Complexity - O(n²)


public class BruteForce{

     public static int majorityEle(int nums[]){
        for(int i=0; i<nums.length; i++){
            int frequency = 0;
            for(int j=i; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    frequency++;
                }
            }
            if(frequency > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

     public static void main(String[] args){
        int nums[] = {3,3,4,2,3};
        int res = majorityEle(nums);
        System.out.println(res);
    }
}