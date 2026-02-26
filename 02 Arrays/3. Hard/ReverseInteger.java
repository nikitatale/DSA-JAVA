// In java there is a range for int 
// Minimum : -2147483648 (Integer.MIN_VALUE)
// Maximum : 2147483647 (Integer.MAX_VALUE)
// if number cross this range triggers overflow 
// x -  1534236469 reverse - 9646324351
// 9646324351 > 2147483647 overflow
// reverseNum = reverseNum * 10 + lastDigit; here multiplication is done which dangerous
// before multiplication always check condition and if trigger overflow return 0
// while( x > 0) is for positive numbers only not works for negative numbers
// in java negative numbers handled  -123 % 10 = -3 & -123 % 2 = -12
// so x != 0 handled both positive and negative 


public class ReverseInteger{
        public static int reverse(int x) {
        int reverseNum = 0;
        while (x != 0){
            int lastDigit = x % 10;
            if(reverseNum > Integer.MAX_VALUE / 10 || reverseNum < Integer.MIN_VALUE/ 10){
                return 0;
            }
            reverseNum = reverseNum * 10 + lastDigit;
            x = x / 10;
        }
        return reverseNum;
    }


    public static void main(String[] args){
        int x = 1534236469;
        int number = reverse(x);
        System.out.println(number);
    }
}