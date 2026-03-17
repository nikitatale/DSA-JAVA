// Time = O(n)
// Space = O(n)

public class ReverseWord{
     public static String reverseWords(String s) {
       s = s.trim();

        String[] arr = s.split("\\s+");

       
        int start = 0, end = arr.length - 1;
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        
        return String.join(" ", arr);
    }

    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(reverseWords(str));
    }
}