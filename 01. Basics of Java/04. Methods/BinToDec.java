
public class BinToDec{
        public static void binToDec(int num){
        int dec = 0;
        int pow = 0;
        int originalNum = num;

        while (num > 0){
            int lastDigit = num % 10;
            if(lastDigit != 0 && lastDigit != 1){
                System.out.println("Invalid Number");
                return;
            }
            dec += lastDigit * (int) Math.pow(2, pow);
            pow++;
            num = num / 10;
        }

        System.out.println("Decimal of " + originalNum + " = " + dec);
    }

    public static void main(String[] args) {
       binToDec(1);
       binToDec(10);
       binToDec(100);
       binToDec(11);
       binToDec(101);
    }
}