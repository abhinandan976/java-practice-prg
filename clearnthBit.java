public class clearnthBit {
    public static void main(String[] args) {
    int n = 13;
    int k = 4;
    System.out.println("Before clearing the bit: " + n);
    int result = clearnthbit(n,k);
    System.out.println("After clearing the bit: " + result);
   }

static int clearnthbit(int n, int k) {
    // AND with negation for the created mask
    return n & ~(1 << k);
}}
