

public class Reverse{
   
   public static void printReverse(int num[]){
      for(int i=num.length-1; i>=0; i--){
        System.out.print(num[i] + " ");
      }
   }
   
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        printReverse(nums);
    }
}