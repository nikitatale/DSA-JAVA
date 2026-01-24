public class CountNums {
    public static void main(String[] args){
      int num = 2;
      int count = 0;
      for(; num>0; num/=10){
          int lastDigit = num % 10;
          count++;
      }

      System.out.println("Count " + count);

    }
}