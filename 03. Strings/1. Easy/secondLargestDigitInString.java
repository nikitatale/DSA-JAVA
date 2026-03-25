// String se jo value milti hai wo character hoti hai (jaise '5'), number nahi.
// Har character ke piche ek hidden number hota hai (ASCII value).
// '0' ek base point hai → uska number 48 hota hai.
// Jab hum ch - '0' karte hain → hum distance nikal rahe hote hain '0' se.
// Isliye '5' - '0' = 5 → character number me convert ho jata hai.



public class secondLargestDigitInString{

   public static int secondHighest(String s) {
        int largest = -1;
        int secLargest = -1;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int nums = s.charAt(i) - '0';
              if(largest < nums){
                  secLargest = largest;
                  largest = nums;
              } else if(nums > secLargest && nums != largest){
                  secLargest = nums;
              }
            }
        }
        return secLargest;
    }

    public static void main(String[] args) {
        String s = "dfa12321afd";
        int res = secondHighest(s);
        System.out.print(res);
    }
}