public class togglekthBit {
    public static void main(String[] args) {
    int n = 5;
    int k = 2;
    System.out.println("Number before the toggle kth bit is: " + n);
    int result = togglekthbit(n,k);

    System.out.println("Number after toggle the kth bit is: " + result);
    }

    static int togglekthbit(int n, int k) { 
        return n ^ (1 << k);
    }
}
