// Ek string di hai jisme numbers bhi hain 
// aur characters bhi. Sirf numbers extract 
// karke print karo.

// Input:  "abc123def456ghi7"
// Output: "123 456 7"

// Input:  "a1b2c3"
// Output: "1 2 3"


public class Problem1 {

    public static String reverseString(String str){
        // create new string
       String newStr = "";

       // loop over string
       for(int i=0; i<str.length(); i++){

        // check if current index > 0 && current index value is letter && previous index value is digit
           if(i > 0 && Character.isLetter(str.charAt(i)) && Character.isDigit(str.charAt(i-1))){
            // if true insert space 
               newStr += " ";
           }
           // check current index value is digit or not
           if(Character.isDigit(str.charAt(i))){
              // if true insert digit only in new string
               newStr += str.charAt(i);

           }
       }
       return newStr;
    }

    public static void main(String[] args){
        String str = "abc123def456ghi7";   // "123 456 7"
        String result = reverseString(str);
        System.out.println(result);
    }
}