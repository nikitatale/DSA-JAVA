//Least Common Multiple
// Do numbers ka sabse chhota number jo dono se exactly divide ho jaye.
//Numbers: 4 & 6
//4 ke multiples: 4, 8, 12, 16, ...
//6 ke multiples: 6, 12, 18, ...
// Common multiple: 12
//Sabse chhota = 12
// LCM = 12

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = (a > b) ? a : b;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}
