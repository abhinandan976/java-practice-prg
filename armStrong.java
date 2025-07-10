import java.util.Scanner;
public class armStrong {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an ArmStrong Number:");
        int num = sc.nextInt();
        armstrong(num);
    }

    static void armstrong(int num) {
        int original = num;
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
        }
        if(original == sum) {
            System.out.println(original + "is an ArmStrong number");
        }
        else{
            System.out.println(original + "is not an ArmStrong number");
        }
    }
}
