import java.util.Scanner;
public class prime{
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        else {
            for(int i = 2; i < Math.sqrt(n);i++) {
                if(n % i ==0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(num + " is prime:" + isPrime(num));
    }
}
