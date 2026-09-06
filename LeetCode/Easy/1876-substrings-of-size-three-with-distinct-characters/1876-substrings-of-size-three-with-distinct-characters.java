class Solution {
    public int countGoodSubstrings(String s) {
      int l = 0;
      int h = 2;
      int n = s.length();
      int count = 0;
      while (h<n){
        if(s.charAt(l)!=s.charAt(l+1) && s.charAt(l+1)!=s.charAt(h) && s.charAt(h) !=s.charAt(l)){
            count++;
        }
        l++;
        h++;
      }
      return count;

    }
}