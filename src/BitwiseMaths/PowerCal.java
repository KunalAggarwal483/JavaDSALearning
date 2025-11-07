package BitwiseMaths;

import readwrite.FastReader;

public class PowerCal {

    int power(int base, int exp) {
        int result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result *= base;
            }
            base *= base;
            exp = exp >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        PowerCal pc = new PowerCal();
        FastReader fr = new FastReader();
  
        int base = fr.nextInt();
        int exp = fr.nextInt();

        int result = pc.power(base, exp);
        System.out.println(base + " raised to the power of " + exp + " is: " + result);
    }
    
}
