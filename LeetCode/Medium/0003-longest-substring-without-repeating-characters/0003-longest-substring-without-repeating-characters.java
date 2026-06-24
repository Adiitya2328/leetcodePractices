class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0 ;
        
        int n = s.length();
        int max= 0;
        HashMap <Character , Integer> freq = new HashMap<>();
        for(int high  = 0 ; high < n ;high++){
            char c = s.charAt(high);
            freq.put(c , freq.getOrDefault(c, 0 ) + 1);
            int k = high - low+1;
            while(freq.size() < k){
                char lowChar = s.charAt(low);
                freq.put(lowChar , freq.get(lowChar) -1);
                if (freq.get(lowChar) == 0){
                    freq.remove(lowChar);
                }
                
                low++;
                k = high - low+1;
            }
            int len = high -low+1;
            max = Math.max(max , len);
        }
        return max;
        
    }
}