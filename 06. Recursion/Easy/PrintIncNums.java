public class PrintIncNums{

    public static void printIncNum(int n){
       if(n == 6) return;   // base case
       System.out.print(n + " ");
       printIncNum(n + 1);  // recursive call
    }

    public static void main(String[] args) {
        printIncNum(1);
    }
}