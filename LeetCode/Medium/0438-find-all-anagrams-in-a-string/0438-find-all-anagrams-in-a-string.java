class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length()){
            return res;
        }
        HashMap<Character , Integer> smap = new HashMap<>();
        HashMap<Character , Integer> pmap = new HashMap<>();
        for(int i = 0 ; i< p.length() ; i++){
            char c = p.charAt(i);
            pmap.put(c , pmap.getOrDefault(c , 0) +1);
        }

        int low = 0; 
        for(int high = 0 ; high<s.length() ; high++){
            char ch = s.charAt(high);
            smap.put(ch , smap.getOrDefault(ch , 0) + 1);
            if(high-low+1 >p.length()){
                char del = s.charAt(low);
                smap.put(del , smap.get(del) -1);
                if(smap.get(del) == 0){
                    smap.remove(del);
                }
                low++;
            }
            if(high -low+1 == p.length()){
                if(smap.equals(pmap)){
                    res.add(low);
                }
            }
        }
       return res; 
    }
}