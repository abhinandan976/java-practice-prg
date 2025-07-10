import java.util.Scanner;
public class stringInput {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        str = sc.next();
        char ch = 'a';
        String personalized = greet(str,ch);
        System.out.println(personalized);
    }

    static String greet(String str,char ch) {
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                return "String found:" + str;
            }
        }
        return "Null";
    }
}
