
import java.util.Scanner;

public class SmallestDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int smallestDigit = Integer.MAX_VALUE;

        while(num > 0){
            int lastDigit = num % 10;
            if(smallestDigit > lastDigit){
                smallestDigit = lastDigit;
            }
            num = num / 10;
        }

        System.out.print("Smallest Digit of number " + originalNum + " = " + smallestDigit);
    }
}