// abcde  - 1a1b1c1d1e
// Time Complexity = O(n)

public class Leetcode{

        public static String compressedString(String word) {  
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<word.length(); i++){
            Integer count = 1;
            while(i < word.length()-1 && word.charAt(i) == word.charAt(i+1) && count < 9){
                count++;
                 i++;
            }

            
            if(count > 0){
                sb.append(count.toString());
            } else {
                sb.append(word.charAt(i));
            }

            sb.append(word.charAt(i));
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";  // 9a5a2b
        String str = compressedString(word);
        System.out.println(str);
    }
}