class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int res = Integer.MIN_VALUE;
        Deque<Integer> st = new ArrayDeque<>();
        st.push(0);
        for(int i = 0 ; i<n; i++){
            res = Math.max(st.peek() , res);
            st.push(st.peek()+gain[i]);
        }
        return Math.max(st.peek(), res);
    }
}