public class PrintName{
    
    public static void printName(int n){
        if(n == 6) return;
        System.out.println("Nikita Tale");
        printName(n + 1);
    }
    
    public static void main(String args[]){
        printName(1);
    }
}