package BitwiseMaths;

import readwrite.FastReader;

public class RangeXor {

    static int xorFromZeroToN(int n){
        if(n % 4 == 0){
            return n;
        } else if (n % 4 == 1){
            return 1;
        } else if (n % 4 == 2){
            return n + 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // range XOR for a to b is xor(0 to b) ^ xor(0 to a-1)

        int a = 3;
        int b = 9;

        FastReader fr = new FastReader();
        int ans = xorFromZeroToN(b) ^ xorFromZeroToN(a - 1);

        System.out.println(ans);
        
    }
    
}
