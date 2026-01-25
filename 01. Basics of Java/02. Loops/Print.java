
import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int choice;

        do{
            System.out.print("Enter number = ");
            int num = sc.nextInt();
            if(num % 2 == 0){
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.println("Do you want to continue press 1 for yes or 0 for no");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
    }
}