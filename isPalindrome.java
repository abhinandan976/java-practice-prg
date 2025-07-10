public class isPalindrome {
    public static void main(String[] args) {
        String str = "gadag";
        System.out.println("Original String is:" + str);
        System.out.println("Is the string a palindrome?" + ispalindrome(str));
    }

    public static boolean  ispalindrome(String str) {
        int start = 0;
        int end = str.length() -1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}