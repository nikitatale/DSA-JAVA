// Time - O(n)
// Space - O(1)

//

public class Leetcode2{

       public static int compress(char[] chars) {
        int idx = 0;
         for(int i=0; i<chars.length; i++){
            char ch = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == ch){
                count++;
                i++;
            }


            if(count == 1){
                chars[idx++] = ch;
            } else {
                chars[idx++] = ch;
                String str = Integer.toString(count);
                for(int j=0; j<str.length(); j++){
                    chars[idx++] = str.charAt(j);
                }
            }

            i--;

         }
        
       return idx;
    }

    public static void main(String[] args) {
        char chars[] = {'a','a','b','b','c','c','c'};
        int result = compress(chars);
        System.out.println(result);
    }
}