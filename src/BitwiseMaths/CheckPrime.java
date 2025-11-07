package BitwiseMaths;

public class CheckPrime {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            System.out.println("i : " + i);
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPrimev2(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;

        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }

        return true;
        
        }


    public static void main(String[] args) {
        
        // for(int i = 1; i <= 20; i++) {
        //     if(isPrime(i)) {
        //         System.out.println(i + " - PRIME.");
        //     } else {
        //         System.out.println(i + " - NOT PRIME.");
        //     }
        // }

        System.out.println(isPrime(1369));

    }
    
}
