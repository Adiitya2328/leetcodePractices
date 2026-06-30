class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        HashMap<Character , Integer> map = new HashMap<>();
        int low = 0; 
        int count = 0;
        for(int high  = 0 ;high<n ; high++){
            char ch = s.charAt(high);
            if(ch == 'a' || ch == 'b' || ch=='c'){
                map.put(ch , map.getOrDefault(ch ,0 )+ 1);
            }
            while(map.size() == 3){
                count += n-high;
                char left = s.charAt(low);
                map.put(left , map.get(left) -1);
                if(map.get(left) == 0){
                    map.remove(left);
                }
                low++;
            }
        }
        return count ;
    }
}