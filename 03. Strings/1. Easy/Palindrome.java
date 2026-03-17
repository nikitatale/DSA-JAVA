// Time = O(n)
// Space = O(1)


class Palindrome {

    public static boolean isPalindrome(String s) {
       s = s.toLowerCase();
        int start = 0, end = s.length()-1;
        while (start < end){
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }

            if(s.charAt(start) != s.charAt(end)){
                return false;
            }

            start++;
            end--;

        }

        return true; 
    }

    public static void main(String[] args) {
     String str = "A man, a plan, a canal: Panama";
     boolean res = isPalindrome(str);
     System.out.println(res);
    }
}