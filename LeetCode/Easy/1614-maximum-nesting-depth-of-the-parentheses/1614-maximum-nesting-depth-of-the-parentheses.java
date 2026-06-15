class Solution {
    public int maxDepth(String s) {
        
        int max = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i< s.length() ; i++){//stack implementation 
            if(s.charAt(i) == '('){
                st.push('(');
                max = Math.max(st.size() , max);
            }else if(s.charAt(i) == ')'){
                st.pop();
                
            }
           
        }
        return max;
    }
}