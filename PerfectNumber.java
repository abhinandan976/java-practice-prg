
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean status = isperfect(n);
        System.out.println(status);
        sc.close();
    }

    public static boolean isperfect(int n) {
        int number = n;
        int total = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                total += i;
            }
        }
        if(total == number) {
            return true;
        }
        return false;
    }
}
