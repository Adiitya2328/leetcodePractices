class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        for(int i = 0 ; i<n;i++){
            ans[i] = prices[i];
        }
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i<n ; i++){
            while(!st.isEmpty() && prices[i] <= prices[st.peek()]){
                int prevIndex = st.pop();
                ans[prevIndex] =prices[prevIndex]-prices[i] ;
            }
            st.push(i);
        }
        return ans;
    }
}