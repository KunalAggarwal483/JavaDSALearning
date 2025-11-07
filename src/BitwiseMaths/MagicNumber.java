package BitwiseMaths;

import readwrite.FastReader;

public class MagicNumber {
    public static void main(String[] args) {

        FastReader fr = new FastReader();
        
        int n = fr.nextInt();
        int result = magicNumber(n);
        System.out.println("The " + n + "th magic number is: " + result);
    }

    // A magic number is a number that can be expressed as a sum of unique powers of 5 like 5^1, 5^2, 5^3, ...
    // example 1: 1st magic number = 5^1 = 5
    // example 2: 2nd magic number = 5^2 = 25
    // example 3: 3rd magic number = 5^1 + 5^2 = 30

    
    static int magicNumber(int n) {
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int lastBit = n & 1;
            n = n >> 1;
            ans += lastBit * base;
            base = base * 5;
        }

        return ans;
    }
    
}
