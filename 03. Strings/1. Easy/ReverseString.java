// Two Pointer Approach
// Time =  O(n)
// Space = O(1)

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while (start < end){
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args){
        char s[] = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.print(Arrays.toString(s));
    }
}