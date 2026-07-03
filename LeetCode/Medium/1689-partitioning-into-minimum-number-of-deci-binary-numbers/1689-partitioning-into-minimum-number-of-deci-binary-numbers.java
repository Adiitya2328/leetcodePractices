class Solution {
    public int minPartitions(String n) {
        int len  = n.length();
        char[] ch = n.toCharArray();
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i<len; i++){
            if(ch[i]-'0' > max){
                max = ch[i]-'0';
            }
        }
        return max;
    }
}