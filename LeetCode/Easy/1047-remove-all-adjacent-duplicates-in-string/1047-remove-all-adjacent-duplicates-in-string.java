class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Deque<Character> st = new ArrayDeque<>();
        String res = "";
        for(int i = 0 ; i<n ; i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek() == s.charAt(i)){
                st.pop();
                continue;
            }st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
    
    return res;
    }
}