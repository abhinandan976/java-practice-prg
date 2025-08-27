import java.util.Scanner;
public class Asciivalues {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = ch;
        System.out.println("Ascii value of " + ch + " is: " + ascii);
        sc.close();
    }
}
