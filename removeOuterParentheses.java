
import java.util.Stack;

public class removeOuterParentheses {
    public static void main(String[] args) {
        Stack<Character> st  = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String s = "(())";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                if(!st.isEmpty()) {
                  sb.append(c);
                }
                st.push(c);
            }       
            else if(c == ')'){
                st.pop();
                if(!st.isEmpty()) {
                    sb.append(c);
                }
            }
        }
        System.out.println("String: " + sb);
    }
}
