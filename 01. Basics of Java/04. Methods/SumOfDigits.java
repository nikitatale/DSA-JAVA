
import java.util.Scanner;

public class SumOfDigits{
    
    public static int countSumOfDigits(int num){
        int sum = 0;

        while(num > 0){
          int lastDigit = num % 10;
          sum += lastDigit;
          num = num / 10;
        }

        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int result = countSumOfDigits(sc.nextInt());
        System.out.println("Sum of digits = " + result);
    }
}