package BitwiseMaths;

import readwrite.FastReader;

public class NoOfDigits {

    public static void main(String[] args) {
        int n = 245;
        int base = 2;

        FastReader fr = new FastReader();

        int digits = countDigits(n, base);
        System.out.println("Number of digits in " + n + " (base " + base + "): " + digits);

        // System.out.println(Integer.parseInt("1000101", 2));
        // System.out.println(Integer.toBinaryString(2147483646));


        // SOME CODE down 

         /*
        int maxDiff = 0;
        int prevIdx = 100;

        while(N > 0){

            // calculate and store 2's complement

            // perfom N & (-N) to get a value with rightmost set bit and store this value temp
            int temp = N & ((~N) + 1);
            // System.out.println("temp : " + temp);

            // calculate the number of bits in temp value , store it as a index
            int index = (int)(Math.log(temp) / Math.log(2)) + 1;

            // System.out.println("index: " + index);
            // calculate difference and store in maxDiff variable

            maxDiff = Math.max((index - prevIdx -1), maxDiff);
            prevIdx = index;
            // subtract temp value from N - will get a number with rightmost set bit unset

            N = N - temp;
            // System.out.println("new N: " + N);
        }

        return maxDiff;
        */
    }

    static int countDigits(int n, int base) {
        
        return (int)(Math.log(n) / Math.log(base)) + 1;
    } 
    
}
