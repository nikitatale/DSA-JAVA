public class MinNum{

    public static void minNum(int num[]){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<=num.length-1; i++){
            if(min > num[i]){
                min = num[i];
            }
        }

        System.out.println("Minimum number of an array: " + min);
    }
  public static void main(String[] args) {
      int nums[] = {20, 30, 10, 40, 50};
      minNum(nums);
  }
}