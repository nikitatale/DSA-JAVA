
import java.util.Arrays;




public class BruteForce{

   
    public static int[] repeatMissing(int nums[][]) {
        int repeatEle = 0;
        int missingEle = 0;
    
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
               for(int x=0; x<nums.length; x++){
                  for(int y=0; y<nums[0].length; y++){
                    if(i == x && j == y) continue;
                    if(nums[i][j] == nums[x][y]){
                       repeatEle = nums[i][j];
                    }
                  }
               }
            }
        }

        for(int num=1; num<=nums.length*nums.length; num++){
            boolean isMissing = false;
            for(int i=0; i<nums.length; i++){
               for(int j=0; j<nums.length; j++){
                  if(nums[i][j] == num){
                    isMissing = true;
                    break;
                  }
               }
            }

            if(isMissing == false){
                missingEle = num;
            }
        }

         return new int[]{repeatEle, missingEle};
    }


    public static void main(String[] args) {
        int nums[][] = {
            {1, 2, 3},
            {4, 6, 7},
            {8, 9, 9}
        };

     int res[] = repeatMissing(nums);
     System.out.println(Arrays.toString(res));
    }
}