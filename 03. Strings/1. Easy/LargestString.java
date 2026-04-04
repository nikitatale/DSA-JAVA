// In give array find the largest string 
// we use lexicographic order - dictionary order, comparing character by character using unicode value;
// 'a' - 97, 'b' - 98, 'c' - 99  c > b > a

// there is a method compareTo used to compare two strings
// if compareTo return 0 means both strings are equals, if compareTo return -1 means first string less than second string 

// we compare string letter wise; if length is x O(x * n) n is number of strings input



public class LargestString{

    public static String largestString(String names[]){
        String largest = names[0];
        for(int i=1; i<names.length; i++){
            if(largest.compareToIgnoreCase(names[i]) < 0){
                largest = names[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String names[] = {"Adam", "Bob", "Devid", "Eve", "Casey", "Tony"};
        String str = largestString(names);
        System.out.println("Largest String in given array : " + str);
    }
}