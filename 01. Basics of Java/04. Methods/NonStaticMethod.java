//Non static method needs an object to call 

public class NonStaticMethod {
    
    public void greet(){
        System.out.println("Hello World!");
    }
    
    public static void main(String[] args){
       NonStaticMethod obj = new NonStaticMethod(); // need object to call 

       obj.greet();
    }
}