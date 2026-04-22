// Reverse Vowels of String using two pointer approach
// Time - O(n)
// Space - O(n)




public class ReverseVowels{
    
    public static String reverseVowels(String str){
       char arr[] = str.toCharArray();

       int start = 0, end = arr.length-1;

       while(start < end){
         
        while(start < end && arr[start] != 'A' && arr[start] != 'a' && arr[start] != 'E' && arr[start] != 'e' && arr[start] != 'I' && arr[start] != 'i' &&
         arr[start] != 'O' && arr[start] != 'o' && arr[start] != 'U' && arr[start] != 'u'){
           start++;
        }

        while(start < end && arr[end] != 'A' && arr[end] != 'a' && arr[end] != 'E' && arr[end] != 'e' && arr[end] != 'I' && arr[end] != 'i' &&
        arr[end] != 'O' && arr[end] != 'o' && arr[end] != 'U' && arr[end] != 'u' ){
            end--;
        }

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;

       }

       String str1 = new String(arr);
       return str1;
    }

    
    public static void main(String[] args) {
        String str = "IceCreAm";
        String res = reverseVowels(str);
        System.out.println(res);
    }
}