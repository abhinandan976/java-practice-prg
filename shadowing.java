public class shadowing {
    static int c = 90;

    public static void main(String[] args) {
        int c = 80;
        System.out.println("Value in the main method: " + c);
        fun();   
    }

    static void fun() {
        System.out.println("Value in the fun method: " + c);
    }
}
