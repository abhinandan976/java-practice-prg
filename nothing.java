import java.util.Scanner;
public class nothing {
    // Using loop
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
    // Using recursion
    public static int factorialRec(int n) {
        return (n == 0) ? 1 : n * factorialRec(n - 1);
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial (Loop): " + factorial(num));
        System.out.println("Factorial (Recursion): " + factorialRec(num));
    }
}