public class largestOddNumber {
    public static void main(String[] args) {
        String str = "3456";
        String result = largestOddNo(str);
        System.out.println("Largest odd number:" + result);
    }

    public static String largestOddNo(String str) {
        for(int i = str.length() - 1; i >= 0; i--) {
            if(((str.charAt(i) - '0') & 1) == 1){
                 return str.substring(0, i + 1);
            }       
        }
        return "";
}
}
