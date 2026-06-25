class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i<n;i++){
//check until the stack is not empty and the temperature is greater than next temp
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int prevIndex = st.pop();//pop the previous index

                res[prevIndex] = i-prevIndex; // calculate the gap between the temps

            }
            st.push(i); //push the next index of the temperature
        }

        return res;
    }
}