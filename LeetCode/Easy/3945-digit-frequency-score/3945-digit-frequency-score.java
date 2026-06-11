
class Solution {
    public int digitFrequencyScore(int n) {
        String s = Integer.toString(n);
        HashMap<Character , Integer> map = new HashMap<>();
       
        int score = 0;
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c , 0)+1);
        }
        for(Map.Entry<Character , Integer> entry:map.entrySet()) {
            int digit  = entry.getKey() - '0';
            int freq  = entry.getValue();
            score+= digit*freq;
        }
        return score;
    }
}