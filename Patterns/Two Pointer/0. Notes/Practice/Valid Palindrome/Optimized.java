public class Optimized{

    public static boolean validPalindrome(String str) {
         int start = 0, end = str.length()-1;

         while(start <= end){
            while(start < end && !Character.isLetterOrDigit(str.charAt(start))){
                start++;
            }

            while (start < end  && !Character.isLetterOrDigit(str.charAt(end))) { 
                end--;
            }

            if(str.charAt(start) != str.charAt(end)){
                return false;
            }

            start++;
            end--;
         }

         return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        boolean res = validPalindrome(str);
        System.out.println(res);
    }
}