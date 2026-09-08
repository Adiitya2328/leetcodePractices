class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int ans=0;
        int low=0;
        int product=1;
        if(k<=1){
            return 0;
        }
        for(int high=0;high<n;high++){
            product*=nums[high];
            while(product>=k){
                
                product/=nums[low];
                low++;
            }
            ans +=high-low+1;
        }

        return ans;
    }
}