package BitwiseMaths;

public class SetBits {

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); // Clear the least significant bit set
            count++;
        }
        return count;

        // Time complexity: O(k) where k is the number of set bits in n
    }


    public static void main(String[] args) {
        int n = 29; // Example number
        int count = countSetBits(n);
        System.out.println("Number of set bits in " + n + " is: " + count);
    }
    
}
