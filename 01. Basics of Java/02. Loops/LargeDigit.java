
import java.util.Scanner;

public class LargeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int largeDigit = 0;

        while(num > 0){
            int lastDigit = num % 10;
            if(largeDigit < lastDigit){
                largeDigit = lastDigit;
            }
            num = num / 10;
        }
      
        System.out.print("Large Digit of number " + originalNum + " = " + largeDigit);

    }
}