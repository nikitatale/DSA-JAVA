import java.util.Scanner;

public class ForReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNum = 0;
        for(; num > 0; num = num / 10){
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
        }
        System.out.println(reverseNum);
    }
}