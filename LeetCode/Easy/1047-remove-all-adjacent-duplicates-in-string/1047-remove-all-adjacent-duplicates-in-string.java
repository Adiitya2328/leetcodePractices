class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        String res = "";
        Deque<Character> st = new ArrayDeque<>();

        for(int i = 0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch == st.peek()){
                st.pop();
                
            }else {
                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            res = st.pop()+res;
        }

        return res;
    }
}