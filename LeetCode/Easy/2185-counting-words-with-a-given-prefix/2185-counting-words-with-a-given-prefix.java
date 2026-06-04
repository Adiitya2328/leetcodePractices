class Solution {
    public int prefixCount(String[] words, String pref) {
        int m = words.length;
        int count = 0; 

        for(int i = 0 ; i<m ;i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}