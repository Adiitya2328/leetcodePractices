class Solution {
    public boolean isPrefixAndSuffix(String str1 , String str2){
        int n = str1.length();
        int m = str2.length();
        
        if(n>m){
            return false;
        }
        String prefix = str2.substring(0,n);
        String suffix = str2.substring(m-n);

        return str1.equals(suffix) && str1.equals(prefix) ;
        
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
                for(int i = 0; i<words.length;i++){
                    for(int j =i+1 ;j<words.length ;j++){
                        if(isPrefixAndSuffix(words[i] , words[j])){
                            count++;
                        }
                    }
                }
                return count;
    }
}