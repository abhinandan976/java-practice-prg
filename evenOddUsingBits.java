public class evenOddUsingBits {
    public static void main(String[] args) {
        int n = 2;
        if((n & 1) == 0) {
            System.out.println("Given number " + n  + " is even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}

