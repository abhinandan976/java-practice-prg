import java.util.Scanner;
public class input1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the two numbers:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println("The sum of two numbers is: " + sum);
        }
    }
}
