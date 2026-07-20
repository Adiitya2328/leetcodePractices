class Solution {
    public boolean judgeSquareSum(int c) {
        for(long a = 0;a*a<=c;a++){
            long b2 = c-a*a;
            long b = (long) Math.sqrt(b2);
            if(b*b == b2){
                return true ;
            }
        }
        return false;
    }
}