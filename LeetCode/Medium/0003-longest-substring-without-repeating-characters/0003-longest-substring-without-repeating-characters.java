class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int n = s.length();
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int high=0;high<n;high++){
            char ch = s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            int k = high-low+1;
            while(map.size()<k){
                char lchar =s.charAt(low);
                map.put(lchar,map.get(lchar)-1);
                if(map.get(lchar) ==0){
                    map.remove(lchar);
                }
                low++;
                k = high-low+1;
            }
            int len =high-low+1;
            max = Math.max(len ,max);
        }
        return max;
    }
}