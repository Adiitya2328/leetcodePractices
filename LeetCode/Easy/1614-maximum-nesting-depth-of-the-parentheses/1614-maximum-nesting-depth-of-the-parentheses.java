class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int max = Integer.MIN_VALUE;
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i< s.length() ; i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                res++;
            }else if(s.charAt(i) == ')'){
                st.pop();
                res--;
            }
            max = Math.max(res, max);
        }
        return max;
    }
}