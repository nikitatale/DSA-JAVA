// Ek string di hai sirf 'a', 'b', 'c' se bani.
// Minimum kitne characters insert karne honge
// taaki woh valid "abcabcabc..." 
// sequence ban jaye?

// Input:  "abcac"
// Output: 1
// ("abcac" → "abcabc" — ek 'b' insert kiya)

// Input:  "aac"
// Output: 1  
// ("aac" → "abc" — ek 'b' insert kiya)

// Input:  "abbc"
// Output: 1
// ("abbc" → "abbc" → "ababc"?? 
//  soch!)

// imagine string is like 3 train stations with fixed sequence
// a -> b -> c -> a -> b -> c

// now string is like "abcac"
// we travel from a to b to c again new cycle a to b to c
// check if any station missed or not

// a to b to c no insertion because they linked in format but after c there is a means new cycle
// but after a there is c but we want a -> b -> c means b missed so insertion 1


// station skip - means how many station missed - insertion
// normal case - go ahead ->  miss = curr - prev - 1

// wrap case - new cycle -> (3 - prev - 1) + curr


public class Problem2 {

    public static int minInsertions(String str){
        int insertion = 0;
        int prev = -1;
        for(int i=0; i<str.length(); i++){
            int curr = str.charAt(i) - 'a';
            if(curr > prev){
                insertion += curr - prev - 1;
            } else {
                insertion += (3 - prev - 1) + curr;
            }
            prev = curr;
        }
        return insertion;
    }

    public static void main(String[] args){
        String str = "abcac";
        int result = minInsertions(str);
        System.out.println(result);
    }
}