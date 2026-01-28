public class DecToBin{
    
    public static void decToBin(int num){
       int pow = 0;
       int bin = 0;
       int originalNum = num;
 
      while(num > 0){
        int remainder = num % 2;
        bin = bin + remainder * (int) Math.pow(10, pow);
        pow++; 
        num = num / 2;
      }

     System.out.println("Binary Number of " + originalNum + " = " + bin);
    }
    
    public static void main(String[] args) {
        decToBin(10);
        decToBin(2);
    }
}