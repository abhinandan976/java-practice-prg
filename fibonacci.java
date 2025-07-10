public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        int n = 10;
        System.out.println("Fibonacci Series up to" + n);
        for(int i = 1; i <=n ; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
