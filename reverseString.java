public class reverseString {
    public static void main(String args[]) {
        char[] s = {'a','e','i','o','u'};

        System.out.println("Reversed String is: " + new String(reversestring(s)));

    }

    public static char[] reversestring(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while( i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return s;
    }
}