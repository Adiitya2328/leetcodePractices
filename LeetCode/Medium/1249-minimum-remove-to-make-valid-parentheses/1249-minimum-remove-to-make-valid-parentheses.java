class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        Deque<Integer> st = new ArrayDeque<>();
        for(int i =0 ; i< arr.length; i++){
            if(arr[i] == '('){
                st.push(i);
            }else if(arr[i] == ')'){
                if(st.isEmpty() ){
                    arr[i] = '!';
                }else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            arr[st.pop()] = '!';
        }

        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]!= '!'){
                res.append(arr[i]);
            }
        }
        return res.toString();
    }
}