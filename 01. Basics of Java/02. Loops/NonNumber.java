// ASCII value of A is 65 
// @ is 64
// so A - @ = 1
// e = 101
// loop is starting from 1 to 101

public class NonNumber{
    public static void main(String[] args){
        for(int i='A'-'@'; i <'e'; i++){
            System.out.println(i);
        }
    }
}