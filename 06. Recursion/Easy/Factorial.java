public class Factorial{

    public static int factorial(int n){
        if(n == 0) return 1;    // base case
        int fact = factorial(n - 1);  // recursive call
        return n * fact;
    }

    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
    }
}