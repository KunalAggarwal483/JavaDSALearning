package BitwiseMaths;

public class FactorsOfN {


    public static void main(String[] args) {

        int n = 36; // Example number

        System.out.println("Factors of " + n + " are:");

        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " " + (n / i) + " ");
            }
        }
    }
    
}
