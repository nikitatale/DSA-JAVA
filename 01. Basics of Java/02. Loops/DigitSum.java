
import java.util.Scanner;

public class DigitSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int sum = 0;

        for(; num>0; num /= 10){
            int lastDigit = num % 10;
            sum += lastDigit;
        }

        System.out.println(sum);


    }
}