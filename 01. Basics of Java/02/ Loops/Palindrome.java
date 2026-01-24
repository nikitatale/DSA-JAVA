import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int reverseNum = 0;
        while (num > 0){
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num = num / 10;
        }
        if(originalNum == reverseNum){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}