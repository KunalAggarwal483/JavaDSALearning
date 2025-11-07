package BitwiseMaths;

public class SieveOfEras {

    public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        // Initialize all entries as true. A value in isPrime[i] will
        // finally be false if i is Not a prime, else true.
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            // If isPrime[p] is not changed, then it is a prime
            if (isPrime[p]) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }


     // TIME COMPLEXITY: O(nlog(log n))

     // n/2 + n/3 + n/5 + n/7 + ... = 
     //n * (1/2 + 1/3 + 1/5 + 1/7 + ...) = n * log(log n)
    
     // n/2 -> no. of multiples of 2 in first loop , 
     // n/3 -> no. of multiples of 3 in first loop , ....
     

    }

    public static void main(String[] args) {
        int n = 50; // Example number
        System.out.println("Prime numbers up to " + n + " are:");
        sieveOfEratosthenes(n);
    }
    
}
