public class Gcd {
    public static void main(String[] args) {
        int n1 = 36;
        int n2 = 60;

        int answer = findgcd(n1,n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + answer);
    }

    public static int findgcd(int n1, int n2)  {
        while(n2 != 0) {
            // Euclidean algorithm
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;

        }
        return n1;
    }
}