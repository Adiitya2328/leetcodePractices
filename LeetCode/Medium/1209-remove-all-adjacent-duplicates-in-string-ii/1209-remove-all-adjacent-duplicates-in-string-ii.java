class Pair {
    char ch;
    int count;
    Pair(char ch , int count){
        this.ch =  ch;
        this.count= count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<Pair> st = new ArrayDeque<>();
        int n = s.length();
        for(int i =0;i<n;i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(new Pair(c ,1));
            }else if(st.peek().ch == c){
                st.peek().count++;
                if(st.peek().count == k){
                    st.pop();
                }
            }else{
                st.push(new Pair(c ,1));
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            Pair p = st.pop();
            for(int i=0;i<p.count;i++){
                res.append(p.ch);
            }
        }
        return res.reverse().toString();
    }
}