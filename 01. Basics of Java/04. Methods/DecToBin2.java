public class DecToBin2 {

    public static void decToBin(int num) {
        if (num == 0) {
            System.out.println("Binary of 0 = 0");
            return;
        }

        StringBuilder bin = new StringBuilder(); // final binary number store
        int originalNum = num;

        while (num > 0) {
            int remainder = num % 2;
            bin.append(remainder); // append LSB first
            num = num / 2;
        }

        bin.reverse(); // reverse because LSB was added first

        System.out.println("Binary of " + originalNum + " = " + bin);
    }

    public static void main(String[] args) {
        decToBin(10);
        decToBin(2);
        decToBin(0);
        decToBin(255);
    }
}
