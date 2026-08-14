class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                st.push(ch[i]);
            }

           
            else {
                if (st.empty()) {
                    return false;
                }

                char top = st.pop();

                if (ch[i] == ')' && top != '(') {
                    return false;
                }

                if (ch[i] == '}' && top != '{') {
                    return false;
                }

                if (ch[i] == ']' && top != '[') {
                    return false;
                }
            }
        }

        return st.empty();
    }
}