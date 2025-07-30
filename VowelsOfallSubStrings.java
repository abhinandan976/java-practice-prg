public class VowelsOfallSubStrings {
    public static void main(String[] args) {
        String str = "abc";
        long result = countVowels(str);
        System.out.println("The number of vowels in the strings is: " + result);
    }

    public static long countVowels(String s) {
        long count = 0;
        int n = s.length();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)) {
                count += (long) (i+1) * (n -i);
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}