public class longestPalindrome {
    public static void main(String[] args) {
        String str = "babaa";

        System.out.println("Palindrome: " + longestpalindrome(str));
    }

    public static String longestpalindrome(String str) {
        if(str.length() <= 1) {
            return str;
        }

        int maxlen = 1;
        String maxStr = str.substring(0,1);
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + maxlen; j <= str.length(); j++) {
                if(j - i > maxlen && isPalindrome(str.substring(i,j))){
                    maxlen = j - i;
                    maxStr = str.substring(i,j);
                }
            }
        }
        return maxStr;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
