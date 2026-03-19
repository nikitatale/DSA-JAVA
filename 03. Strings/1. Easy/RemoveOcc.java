// Time = O(n2)
// Space = O(n)

public class RemoveOcc{
    public static String removeOccurrences(String s, String part) {
         while(s.contains(part)){
            int idx = s.indexOf(part);
            s = s.substring(0, idx) + s.substring(idx + part.length());
        }
        return s; 
    }

    public static void main(String [] args){
        String s = "daabcbaabcbc";
        String part = "abc";
        String res = removeOccurrences(s, part);
        System.out.println(res);
    }
}