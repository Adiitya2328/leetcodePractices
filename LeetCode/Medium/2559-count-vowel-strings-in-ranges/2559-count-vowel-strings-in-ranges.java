class Solution {
    private Boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] valid = new int[n];
        for(int i = 0 ; i< n ; i++){
            String word = words[i];
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length()-1);
            if(isVowel(firstChar) && isVowel(lastChar)){
                valid[i] = 1;
            }else{
                valid[i] = 0;
            }
        }
        int[] prefix = new int[n];
        prefix[0] = valid[0];
        for(int i = 1; i<n ;i++){
            prefix[i] = prefix[i-1] +valid[i];
        }
         int[] ans = new int[queries.length];
        for(int i = 0; i<queries.length; i++){
            int L = queries[i][0];
            int R = queries[i][1];

            if(L == 0){
                ans[i] = prefix[R];
            }else{
                ans[i] = prefix[R]-prefix[L-1];
            }
        }
        return ans ;
    }
}