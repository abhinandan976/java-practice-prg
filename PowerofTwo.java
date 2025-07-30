import java.util.Scanner;

public class PowerofTwo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (ispoweroftwo(n)) {
            System.out.println("The given " + n + " is a power of 2");
        } else {
            System.out.println("The given " + n + " is not a power of two");
        }

        sc.close();
    }

    static boolean ispoweroftwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}