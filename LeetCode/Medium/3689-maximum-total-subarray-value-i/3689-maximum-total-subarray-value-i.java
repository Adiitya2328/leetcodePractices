class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i< n ;i++){
            max = Math.max(nums[i] , max);
            min = Math.min(nums[i], min);
        }
        long diff = max-min;
        long result = diff*k;
        return result;
    }
}