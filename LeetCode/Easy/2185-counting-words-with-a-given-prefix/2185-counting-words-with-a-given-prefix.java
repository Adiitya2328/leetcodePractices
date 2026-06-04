class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int m = words.length;
        int count = 0;
        for(int i = 0 ; i<m ; i++){
            if(words[i].length() >=n && words[i].substring(0,n).equals(pref)){
                count++;
            }
        }
        return count;
    }
}