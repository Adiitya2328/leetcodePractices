class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int low=0;
        int count=0;
        for(int high=0;high<n;high++){
            char ch = s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                count +=n-high;
                char lowChar = s.charAt(low);
                map.put(lowChar,map.get(lowChar)-1);
                if(map.get(lowChar)==0){
                    map.remove(lowChar);
                }
                low++;
            }
        }
        return count;
    }
}