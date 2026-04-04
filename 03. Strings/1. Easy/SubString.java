public class SubString{

     public static String subString(String str, int startIndex, int endIndex){
       String newStr = "";
       for(int i=startIndex; i<endIndex; i++){
         newStr += str.charAt(i);
       }

       return newStr;
     }

    public static void main(String[] args) {
        String str = "Hello World";
        String subStr = subString(str, 0, 5);
        System.out.println(subStr);
    }
}