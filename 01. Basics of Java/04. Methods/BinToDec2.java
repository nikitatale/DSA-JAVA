//Binary number should be handled as String to avoid octal issues and to validate digits properly.
// any integer start with 0 treated as octal (base 8) if we add 011 output will be 9
// use 11 or "011"

// '0' = 48 & '1' = 49 ASCII values
//  int digit = ch - '0';  
// if ch = '1' = '1' - '0' = 1 character converts in number

public class BinToDec2 {

  
   public static void binToDec(String num){
    int dec = 0;
    int pow = 0;

    for(int i=num.length() - 1; i>=0; i--){
        char ch = num.charAt(i);
        if(ch != '0' && ch != '1'){
            System.out.println("Invalid Binary Number");
            return;
        }
        int digit = ch - '0';
        dec += digit * (int) Math.pow(2, pow);
        pow++;
    }
    
    System.out.println("Decimal of " + num + " = " + dec);
   }

    public static void main(String[] args) {
        binToDec("011");
    }
}
