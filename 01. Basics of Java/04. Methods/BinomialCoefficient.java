public class BinomialCoefficient{
    
    public static int factNum(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *= i;
        }

        return fact;
    }

    public static int binCoeffi(int n, int r){
      int fact_n = factNum(n);
      int fact_r = factNum(r);
      int fact_nmr = factNum(n - r);
      int binFact = fact_n / (fact_r * fact_nmr);
      return  binFact;
    }
    
    public static void main(String[] args) {
        int result = binCoeffi(5, 2);
        System.out.println(result);
    }
}