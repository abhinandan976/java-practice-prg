public class reversewords {
    public static void main(String[] args) {
        String str = "this is a test";
        String reversed = reverseWords(str);
        System.out.println("Reversed words: " + reversed);
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if(i!=0) {
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}
