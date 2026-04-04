// Time - O(n log n)
// Space - Two extra char arrays → O(n)


import java.util.Arrays;

public class AnagramStrings{

    public static void checkAnagrams(String str1, String str2){
            str1 = str1.toLowerCase().trim();
            str2 = str2.toLowerCase().trim();

            if(str1.length() == str2.length()){
             
             char strArr1[] = str1.toCharArray();
             char strArr2[] = str2.toCharArray();

             Arrays.sort(strArr1);
             Arrays.sort(strArr2);

             boolean res = Arrays.equals(strArr1, strArr2);

             if(res){
                System.out.println("Strings are Anagram");
             } else{
                System.out.println("Strings are Not Anagram");
             }

            } else {
                System.out.println("Length of both strings are not equals - Not Anagram");
            }

    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        checkAnagrams(str1, str2);
    }
}