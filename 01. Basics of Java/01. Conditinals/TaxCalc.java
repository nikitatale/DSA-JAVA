import java.util.Scanner;

public class TaxCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary to calculate tax: ");
        int salary = sc.nextInt();
        int tax;

        if(salary < 500000){
            tax = 0;
        } else if(salary >= 500000 && salary <= 800000){
            tax = (int) (salary * 0.2);
        } else {
            tax = (int) (salary * 0.3);
        }

        System.out.println("Your Tax for salary $" + salary + " is " + tax + "%");
    }
}