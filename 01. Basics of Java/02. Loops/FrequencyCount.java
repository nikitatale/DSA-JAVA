//Given a number n and a digit d, count how many times d appears in n.


import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   // original number
        int digit = sc.nextInt(); // digit to count
        int count = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit == digit) {
                count++;
            }
            num = num / 10;
        }

        System.out.println(count);
    }
}
