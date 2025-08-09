// Last updated: 8/1/2025, 10:34:24 PM
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (!st.isEmpty()) {
                    sb.append(ch); // not outermost
                }
                st.push(ch);
            } 
            else if (ch == ')') {
                st.pop();
                if (!st.isEmpty()) {
                    sb.append(ch); // not outermost
                }
            }
        }

        return sb.toString();
    }
}
