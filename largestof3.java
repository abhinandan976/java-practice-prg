import java.util.Scanner;
public class largestof3{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int largest;
        if (a >= b && a >=c ){
            largest = a;
        }   
        else if (b >= a && b>= c) {
            largest = b;
        }
        else {
            largest = c;
        }
        System.out.println("The Largest number is:" + largest);
     }
}