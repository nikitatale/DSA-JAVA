// Reverse Only Letters
// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.

// Convert the string into a char array so characters can be modified (since Java strings are immutable).
// Use two pointers (start and end).
// If both characters are letters, swap them; if the left character is special, move start++; if the right character is special, move end--  

// Time: O(n) because each character is processed once using two pointers.
// Space: O(n) due to conversion of string into a mutable char array for swapping operations.

public class ReverseLetter{

        public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray(); // convert string into array

        int start = 0, end = arr.length-1;
        while (start < end){
            if(!Character.isLetter(arr[start])){
                start++;
            } else if(!Character.isLetter(arr[end])){  // check for special characters like -, /, %
                end--;
            } else {
                char temp = arr[end];
                arr[end] = arr[start];
                arr[start] =  temp;

                start++;
                end--;
            }
        }

         String str1 = new String(arr);  // convert array into string 
         return str1;
    }


    public static void main(String[] args){
      
        String str = "a-bC-dEf-ghIj";
        String str1 = reverseOnlyLetters(str);
        System.out.println(str1);
    }
}