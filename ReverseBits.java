public class ReverseBits {
    public static void main(String[] args) {
        int n = 43261596;
        int res = reverseBits(n);
        System.out.println("Reversed bits of " + n  + "is :" + res);
    }

    static int reverseBits(int n) {
        int rev = 0;
        for(int i = 0; i < 32; i++) {
            rev <<= 1; // Shift rev to the left to make space for the next bit
            rev |= (n & 1); // Add the least significant bit of n to rev
            n >>= 1; // Shift n to the right to process the next bit
        }
        return rev;
    }
}
