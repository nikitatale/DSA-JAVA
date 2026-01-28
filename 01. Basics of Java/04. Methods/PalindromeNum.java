
import java.util.Scanner;

public class PalindromeNum{
    
    public static int reverseNum(int num) {
        int reverseNum = 0;

        while(num > 0){
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num = num / 10;
        }

        return reverseNum;
    }

    public static boolean isPalindrome(int num){
        if(num < 0){
           return false;
        }
       else if(num == reverseNum(num)){
            return true;
        } else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check palindrome: ");
        System.out.println(isPalindrome(sc.nextInt()));
    }
}