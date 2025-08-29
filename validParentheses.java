import java.util.*;
public class validParentheses {
    public static void main(String[] args) {
        String s = "}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch: s.toCharArray()) {
          if(ch == '(' || ch == '{' || ch == '[') {
     st.push(ch);
   }
   else {
       if(st.empty()) {
         return false;
       }
       char top = st.peek();
       if((ch == ')' && top != '(') || 
          (ch == ']' && top != '[') ||
          (ch == '}' && top != '{')) {
         return false;
       }
       st.pop();
    }
}

    return st.isEmpty();

}
}
