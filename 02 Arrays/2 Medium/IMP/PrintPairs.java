public class PrintPairs{

    public static void printPairs(int nums[]) {
       int totalPairs = 0;
       for(int i=0; i<nums.length; i++){
         for(int j=i+1; j<nums.length; j++){
            System.out.print("( " + nums[i] + ", " + nums[j] + " )");
            totalPairs++;
         }
         System.out.println("");
       }
       System.out.println("Total Pairs = " + totalPairs);
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        printPairs(nums);
    }
}