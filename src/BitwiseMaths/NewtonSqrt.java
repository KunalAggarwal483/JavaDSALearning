package BitwiseMaths;

public class NewtonSqrt {


    public static double sqrt(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number");
        }
        if (n == 0 || n == 1) {
            return n;
        }

        double x = n; // initial guess - square root assumed
        double root;  // actual square root 

        while(true){

            root = 0.5 * ((n / x) + x);

            // |root - x| -> error
            if(Math.abs(root -x) < 0.5) break;

            x = root;  // update x to the new root
        }

        return root;
    }

    public static void main(String[] args) {
        double number = 40;
        double result = sqrt(number);
        System.out.println("The integer square root of " + number + " is: " + result);
    }
    
}
