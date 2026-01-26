public class NonVoid {

    public static int add(int a, int b) {  //parameters
         return a + b;
    }

    public static int sub(int a, int b){  //parameters & return type is non-void
        return a - b;  // must return value
    }

    public static void main(String[] args) {  // return type is void & does not return value

        int sum = add(3, 4);   //arguments
        int diff = sub(4, 2);  //arguments

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
    }
}