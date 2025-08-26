import java.util.*;
public class countingBits {
    public static void main(String[] args) {
        int n = 2;
        int[] result = countBits(n);
        System.out.println("Counting bits from 0 to" + n + "is " +  Arrays.toString(result));
    }

    static int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for(int i = 0; i < n; i++)
            bits[i] = bits[i & (i - 1)] + 1;
        return bits;
        }
        
}