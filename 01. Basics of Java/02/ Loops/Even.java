import java.util.Scanner;

public class Even {
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2;
        while (i <= num){
            System.out.println(i);
            i += 2;
        }
    }
}