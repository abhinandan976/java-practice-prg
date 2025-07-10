public class Overloading {
    public static void main(String[] args) {
        int ans = add(1,2);
        int ans2 = add(1,2,3);
        System.out.println("Sum of two integers:" + ans);
        System.out.println("Sum of three integers:" + ans2);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c ) {
        return a + b + c;
    }
}
