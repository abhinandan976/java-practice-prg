public class makePalindrome {
    public static void main(String[] args) {
        String s = "race";
        String result = makepalindrome(s);
        System.out.println("Palindrome :" + result);
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right--))
                return false;
            
        }
        return true;
    }

    public static String makepalindrome(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(isPalindrome(s.substring(i))) {
                StringBuilder prefix = new StringBuilder(s.substring(0,i));
                return s + prefix.reverse().toString();
            }
        }
        return s;
    }
}