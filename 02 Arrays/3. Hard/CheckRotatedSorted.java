// Agar koi array sorted and rotated hai, to usme normally elements increasing order me hote hain,
// lekin rotation ki wajah se ek jagah order break hota hai. Is break point par nums[i] > nums[i+1]
// hota hai. Pure array me agar ye break sirf ek baar (maximum) mile, to array sorted and rotated 
// consider hota hai. Check karte waqt last element ko bhi first element se compare kiya jata hai 
// kyunki array ko circular way me treat karte hain. Agar break 1 se zyada ho, to array sorted rotated nahi hai.

// 3 < 4
// 4 < 5
// 5 > 1  ← break
// 1 < 2

// Sirf 1 break point (5 > 1) hai, isliye array sorted and rotated hai.

// nums[(i+1) % n]
// (4+1) % 5 = 5 % 5 = 0
// nums[4] > nums[0]
// 2 > 3
// last element bhi first element se compare ho gaya. Isi ko circular comparison bolte hain.

public class CheckRotatedSorted{

   public static boolean check(int nums[]){
    int count = 0;
        int n = nums.length;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > nums[(i+1)%n]){
                count++;
            }
        }
        return count <= 1;
   }

    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};  //true
        boolean result = check(nums);
        System.out.print(result);
    }
}