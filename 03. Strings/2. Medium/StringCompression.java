// Time - O(n)


public class StringCompression{

    public static String compressedString(String str){
      StringBuilder sb = new StringBuilder("");

      for(int i=0; i<str.length(); i++){
         Integer count = 1;
         while(i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)){
            count++;
            i++;
         }

         sb.append(str.charAt(i));
         if(count > 1){
            sb.append(count.toString());
         }
      }

      return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbcc";   // a4b3c2
        String res = compressedString(str);
        System.out.println(res);
    }
}