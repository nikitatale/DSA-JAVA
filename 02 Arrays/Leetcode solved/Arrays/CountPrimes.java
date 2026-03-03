// Use Sieve of Eratosthenes
// Find all prime numbers less than n
// Fast method compared to checking each number individually

// Boolean array create kiya of size n → initially sab true
// 0 aur 1 ko false set kiya → kyunki 0 aur 1 prime nahi hain
// Loop from i = 2 to √n
// Agar isPrime[i] == true → ye number prime hai
// Mark all multiples starting from i*i as false
// Example: i=2 → j=4,6,8,… < n → false
// i=3 → j=9,12,… < n → false
// Loop automatically stop when i*i >= n
// Count all remaining true values in boolean array → ye sab primes hain
// Return count → number of primes < n 

import java.util.Arrays;

public class CountPrimes{

         public static int countPrimes(int n) {
          if(n <= 2) return 0;
          boolean isPrime[] =  new boolean[n];
          Arrays.fill(isPrime, true);
          isPrime[0] = false;
          isPrime[1] = false;

          for(int i=2; i*i < n; i++){
            if(isPrime[i]){
                for(int j=i*i; j<n; j += i){
                    isPrime[j] = false;
                }
            }
          } 

          int count = 0;
          for(boolean prime: isPrime){
            if(prime)  count++;
          }

          return count;
    }

     public static void main(String[] args){
       int n = 10;
       int res = countPrimes(n);
       System.out.print(res);
   }
}