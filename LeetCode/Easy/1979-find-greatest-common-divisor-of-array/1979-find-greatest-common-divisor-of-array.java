class Solution {
    int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public int findGCD(int[] nums) {
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            Max = Math.max(nums[i],Max);
            Min = Math.min(nums[i],Min);
        }
    return gcd(Max ,Min);
    }
}