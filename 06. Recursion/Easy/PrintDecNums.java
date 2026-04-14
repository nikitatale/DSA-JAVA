public class PrintDecNums {
    
    public static void printDecNums(int n){
        if(n == 0) return;   // base case
        System.out.print(n + " ");
        printDecNums(n - 1);   // recursive call
    }

    public static void main(String[] args) {
        printDecNums(5);
    }
}