//outer loop check for each number for number is prime or not
// assumes that number is prime if any divisor find we can make it false
// inner loop checks that i divides n if yes then isPrime becomes false
// if condition for prime number is true then print prime number in outer loop


import java.util.Scanner;

public class Prime_Range{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}