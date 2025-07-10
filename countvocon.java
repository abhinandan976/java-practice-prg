public class countvocon {
    public static void main(String[] args) {
        String str = "abhi";
        System.out.println("Original String is:" + str);
        System.out.println("Number of vowles and consonants in the strinig is:" + countvocon(str));
    }
    public static int countvocon(String str) {
        int count1 = 0;
        int count2 = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
                count1++;
            }
            else {
                count2++;
            }
        }
        System.out.println("Number of vowles:" + count1);
        System.out.println("Number of consonants:" + count2);
        return 0;
    }
    
}
