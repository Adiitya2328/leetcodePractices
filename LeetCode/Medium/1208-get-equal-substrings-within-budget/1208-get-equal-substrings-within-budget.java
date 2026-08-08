class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int low  = 0;
        int sum = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int high = 0 ; high <n ; high++){
            int cost = Math.abs(s.charAt(high) - t.charAt(high));
             sum += cost;       // added the cost in the sum for each character

            while(sum> maxCost){//if total sum increase more than maxCost 
                sum -=  Math.abs(s.charAt(low) - t.charAt(low)); //start decrementing the cost atLow
                low++;
            }
            int len = high-low+1;
            maxLen = Math.max(len , maxLen); //calculate the maxLength

        }
        return maxLen;
    }
}