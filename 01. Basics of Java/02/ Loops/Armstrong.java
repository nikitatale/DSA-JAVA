//A number is Armstrong if:
//sum of each digit raised to the power of total digits = original number
// 370 → 3³ + 7³ + 0³ = 370

//Pehle loop me num ko digit by digit divide karke count++ se total digits nikalti ho.
// Is loop ke baad num 0 ho jata hai, isliye original number ki 2 copies (originalNum1 aur originalNum2)
// store kar leti ho. Second loop me originalNum1 ka last digit nikal kar usko count power me raise
// karke arm me add karti ho. originalNum1 bhi loop ke baad 0 ho jata hai, isliye final comparison ke
// liye originalNum2 use hota hai. Agar arm aur originalNum2 equal ho to number Armstrong hota hai,
// nahi to nahi.


public class Armstrong {
    public static void main(String[] args){
        int num = 371;
        int originalNum1 = num;
        int originalNum2 = num;
        int count = 0;
        int arm = 0;

        while (num > 0){
            int lastDigit = num % 10;
            num = num / 10;
            count++;
        }

        while (originalNum1 > 0){
            int lastDigit = originalNum1 % 10; // 3
            arm += (int)Math.pow(lastDigit, count); // 344 + 27 = 371
            originalNum1 = originalNum1 / 10; //
        }

        if(arm == originalNum2){
            System.out.println("Armstrong number");
        } else  {
            System.out.println("Not Armstrong number");
        }
    }
}