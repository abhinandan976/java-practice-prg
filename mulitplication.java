public class mulitplication {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Multiplication table:");
        for(int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + "=" + (a * i));
        }
    }
}
