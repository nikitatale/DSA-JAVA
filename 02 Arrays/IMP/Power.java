class Power {

    public static double power(double x, int n) {

        if(n == 0) return 1;

        long exp = n;   
        if(exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double result = 1;

        while(exp > 0) {

            if(exp % 2 == 1) {
                result = result * x;
            }

            x = x * x;
            exp = exp / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2.00000, -2));  
    }
}
