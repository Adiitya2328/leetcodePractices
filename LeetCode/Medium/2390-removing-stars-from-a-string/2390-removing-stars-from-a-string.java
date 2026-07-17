class Solution {
    public String removeStars(String s) {
        int n = s.length();
        
        String res = "";
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch == '*' ){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
        return res;
    }
}