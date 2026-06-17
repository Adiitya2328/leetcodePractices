class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(0);
        int n = s.length();
        int score  = 0; 
        for(int i = 0 ; i< n ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(0);
            }else {
                int curr = st.pop();
                if(curr == 0){
                    curr = 1;
                }else{
                    curr = 2*curr;
                }
                st.push(st.pop()+curr);
            }
        }
        return st.pop();
    }
}