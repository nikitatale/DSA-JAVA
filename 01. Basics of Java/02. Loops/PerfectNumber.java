//Sum of its proper divisors (excluding itself) = number
// 6 → 1 + 2 + 3 = 6

import java.util.Scanner;

public class PerfectNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<= num / 2; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if(sum == num){
            System.out.print("Perfect Number");
        } else{
            System.out.print("Not Perfect Number");
        }

    }
}