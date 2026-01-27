//Do numbers ko divide karne wala sabse bada number jo dono ko exactly divide kare (remainder 0).
//12 ke factors: 1, 2, 3, 4, 6, 12
// 18 ke factors: 1, 2, 3, 6, 9, 18

// Common factors: 1, 2, 3, 6
// Sabse bada common = 6

//  GCD = 6


import java.util.Scanner;

public class GreatestCommonDivisor{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }
}