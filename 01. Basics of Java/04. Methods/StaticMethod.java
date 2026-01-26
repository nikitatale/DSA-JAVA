// Static method can be called without creating an object.

public class StaticMethod{

    public static void greet(){
      System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        greet();  //no object needed
    }
}
