
import java.util.Scanner;

public class OddEvenDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int even = 0;
        int odd = 0;

        while(num > 0){
          int lastDigit = num % 10;
          if(lastDigit % 2 == 0){
            even++;
          } else{
            odd++;
          }
          num = num / 10;
        }
        
        System.out.println("Even Digit = " + even + " & Odd Digit = " + odd + " of number " + originalNum);

    }
}