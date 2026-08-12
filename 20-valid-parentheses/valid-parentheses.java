class Solution {
    public boolean isValid(String s) {
        Stack<Character> st =new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                char r = st.pop();
                if((c == ')' && r != '(') || (c == '}' && r != '{') || (c == ']' && r != '[')){
                    return false;
                }
            }
            
        }
        return st.isEmpty();
    }
}