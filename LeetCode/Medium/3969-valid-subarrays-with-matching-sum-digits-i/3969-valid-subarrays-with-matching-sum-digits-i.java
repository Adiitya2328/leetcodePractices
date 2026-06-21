class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int valid = 0;
        for(int i = 0; i<n;i++){
            long sum  = 0;
            for(int j = i;j<n;j++){
                sum += nums[j];
                long last = Math.abs(sum)%10;
                long first = Math.abs(sum);
                while( first>=10){
                    first/=10;
                }
                if(first == x && last == x){
                    valid++;
                }
            }
        }
        return valid;
    }
}