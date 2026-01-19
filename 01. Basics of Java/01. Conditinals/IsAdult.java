import java.util.Scanner;

public class IsAdult {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if(age >= 13 && age <= 15){
            System.out.println("Teen");
        } else if(age >= 18){
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }
    }
}