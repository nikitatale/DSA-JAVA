// Har uppercase letter ko ASCII me 32 add karne se lowercase ban jata hai
// Sirf uppercase check kar rahe ho, so lowercase pe koi effect nahi hoga

// 'A' (65) → 'Z' (90)
// 'a' (97) → 'z' (122)

// 65 + 32 = 97 // small 'a'

public class LowercaseConversion{
    
    public static String toLowerCase(String s) {
       char[] arr = s.toCharArray();

       for(int i=0; i<arr.length; i++){
        if(arr[i] >= 'A' && arr[i] <= 'Z'){
            arr[i] = (char)(arr[i] + 32);
        }
       }

       String result = new String(arr);
       return result;
    }
    
    public static void main(String[] args) {
       String s = "Hello";
       String res = toLowerCase(s);
       System.out.println(res);  
    }
}