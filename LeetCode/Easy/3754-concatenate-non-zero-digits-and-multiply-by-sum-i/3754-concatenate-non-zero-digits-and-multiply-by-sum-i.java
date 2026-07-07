class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0){
            return 0;
        }
        String s = Long.toString(n);
        int len = s.length();
        String sx = "";
        int sum = 0;
        for(int i =0;i<len;i++){
            char ch = s.charAt(i);
            if(ch!='0'){
                sx += ch;
                sum+=ch-'0';
            }
        }
        long x = Long.parseLong(sx);
        long ans = x*sum;
        return ans;
    }
}