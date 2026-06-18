class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int n = s.length();
        for(int i = 0 ; i< n ; i++){
            char ch = s.charAt(i);
            if(ch == ')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
            }else if(ch == '}' && !st.isEmpty() && st.peek() == '{'){
                st.pop();
            }else if(ch == ']' && !st.isEmpty() && st.peek() == '['){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        if (st.size() == 0){
            return true;
        }
        return false;
    }
}