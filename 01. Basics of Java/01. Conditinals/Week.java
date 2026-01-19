import java.util.Scanner;

public class Week {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 6 only!: ");
        int num = sc.nextInt();

        switch (num){
            case 0 : System.out.println("Sunday-Funday");
            break;
            case 1 : System.out.println("Monday-Workday");
            break;
            case 2 : System.out.println("Tuesday-Stressday");
            break;
            case 3 : System.out.println("Wednesday-Boring");
            break;
            case 4 : System.out.println("Thursday-Sleepday");
            break;
            case 5 : System.out.println("Friday-Weekend");
            break;
            case 6 : System.out.println("Saturday");
            break;
            default: System.out.println("Nothing....");
        }

        sc.close();
    }
}