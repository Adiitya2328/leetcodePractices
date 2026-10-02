class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans =new int[seq.length()];
        int pos=0;
        int depth=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                depth++;
                ans[pos]=depth%2;
                pos++;
            }else{
                ans[pos]=depth%2;
                pos++;
                depth--;
            }
        }
        return ans;
    }
}