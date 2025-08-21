
import java.util.*;

public class gcdSumsubset {
    public static void main(String[] args) {
        int[] arr = {2,4,6};
        int result = gcdSumSubset(arr);
        System.out.println("GCD of subset arrays is:" + result);
    }

    public static int gcdSumSubset(int[] arr) {
        int n = arr.length;
        int sumofGCD = 0;

        for(int mask = 1; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                if((mask & (1 << i)) != 0) {
                    subset.add(arr[i]);
                }
            }
            int gcdvalue = gcdOfsubset(subset);
            sumofGCD += gcdvalue;
        }
        return sumofGCD;
    }
    
    public static int gcdOfsubset(List<Integer> subset) {
        if(subset.isEmpty()) {
            return 0;
        }
        int result = subset.get(0);
        for(int i = 1; i < subset.size(); i++) {
            result = gcd(result, subset.get(i));
        }
        return result;
    }

    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else  {
            return gcd(b, a % b);
        }
    }


}
