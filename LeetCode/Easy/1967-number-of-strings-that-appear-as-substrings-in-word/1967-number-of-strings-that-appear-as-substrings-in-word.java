class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i = 0 ; i<patterns.length; i++){
            String words = patterns[i];
            boolean exist = word.contains(words);
            if(exist){
                 count++;
            }
           
        }
        return count;
    }
}