import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ot reverse:");
        int a = sc.nextInt();
        int reversed = 0;
        while(a != 0) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a = a /10;
        }
        System.out.println(reversed);
    }
}
