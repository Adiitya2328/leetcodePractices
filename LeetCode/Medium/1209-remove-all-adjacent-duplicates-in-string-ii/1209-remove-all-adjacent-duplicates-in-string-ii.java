class Pair {
    char ch;
    int count;
    Pair(char ch , int count){
        this.ch =  ch;
        this.count= count; //made a pair class to add the pair of character and their count 
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<Pair> st = new ArrayDeque<>();
        int n = s.length();
        for(int i =0;i<n;i++){
            char c = s.charAt(i);
            if(st.isEmpty()){//checked if the st is empty then push the pair 
                st.push(new Pair(c ,1));
            }else if(st.peek().ch == c){//if ch is same then increase the count
                st.peek().count++;
                if(st.peek().count == k){// if count matches k during increment delete the top pair 
                    st.pop();
                }
            }else{
                st.push(new Pair(c ,1));//else add the pair
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            Pair p = st.pop();
            for(int i=0;i<p.count;i++){
                res.append(p.ch);//take out the characters only from the pairs inside st
            }
        }
        return res.reverse().toString();//reverse the output 
    }
}