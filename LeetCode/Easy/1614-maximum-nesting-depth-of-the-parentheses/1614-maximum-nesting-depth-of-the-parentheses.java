class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< s.length() ; i++){//string implementation 
            if(s.charAt(i) == '('){
                res++;
            }else if(s.charAt(i) == ')'){
                res--;
            }
            max = Math.max(res , max);
        }
        return max;
    }
}