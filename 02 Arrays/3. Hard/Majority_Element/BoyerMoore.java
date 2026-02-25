// Boyer Moore's Voting Algorithm 
// It finds the majority element (appears more than n/2 times) in O(n) time and O(1) space.
// It keeps a candidate and a frequency counter.
// If frequency becomes 0, a new candidate is selected.
// Same element increases count, different element decreases count (pair cancellation).
// The final candidate will be the majority element if it exists.


public class BoyerMoore{
     public static int boyerMooreVotingAlgorithm(int nums[]){
        int frequency = 0, element = 0;

        //choose candidate element
        for(int i=0; i<nums.length; i++){
            if(frequency == 0){
                element = nums[i];
            }
            if(element == nums[i]){
                frequency++;
            } else {
                frequency--;
            }
        }
        
        //verify element count
        int count = 0;
        for(int i=0; i<nums.length; i++){
           if(nums[i] == element){
            count++;
           }
        }

        if(count > nums.length/2){
            return element;
        }
        return -1;
    }

    public static void main(String[] args){
        int nums[] = {1, 3, 3, 3, 3, 5};
        int res = boyerMooreVotingAlgorithm(nums);
        System.out.println(res);
    }
}