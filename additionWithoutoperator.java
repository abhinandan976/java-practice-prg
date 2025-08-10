public class additionWithoutoperator {
    public static void main(String args[]) {
        int a = 12;
        int b = 23;

        while(b != 0) {
            int carry = a & b;

            a = a ^ b;

            b = carry << 1;
        }

        System.out.println(a);
    }
}
