public class sumofTwo{
    public static void main(String[] args) {
        int a = -1;
        int b = -2;
        int sum = sumoftwo(a,b);
        System.out.println("Sum of two: " + sum);
}

public static int sumoftwo(int a, int b) {
    while(b != 0) {
        int carry = (a & b) << 1; // calculating the carry
        a = a ^ b; // sum without carry
        b = carry; // updating the carry of next iteration
    }
    return a;
}
}