class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int res = 0;
        Deque<String> st = new ArrayDeque<>();
        for(int i = 0 ; i< n ; i++){
            String s = operations[i];
            if(s.equals("D")){
                int val = 2 * (Integer.parseInt(st.peek()));
                st.push(Integer.toString(val)) ; 
            }else if(s.equals("C")){
                st.pop();
            }else if(s.equals("+")){
                int one = Integer.parseInt(st.pop());
                int two = Integer.parseInt(st.peek());
                int sum = one+two;
                st.push(Integer.toString(one));
                st.push(Integer.toString(sum));
            }else{
                st.push(s);
            }
        }
        while (!st.isEmpty()) {
    res += Integer.parseInt(st.pop());
}


        return res;
    }
}