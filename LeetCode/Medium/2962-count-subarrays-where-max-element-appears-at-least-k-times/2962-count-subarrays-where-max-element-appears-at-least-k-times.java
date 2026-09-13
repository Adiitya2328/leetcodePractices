class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int countMax =0;
        for(int i = 0 ; i<n;i++){
            max =Math.max(max,nums[i]);
        }
        long res = 0;
        int low = 0;
        for(int high = 0 ; high<n ; high++){
            if(nums[high] == max){
                countMax++;
            }
            while(countMax >= k){
                res+=n-high;

                if(nums[low]== max){
            countMax--;
                }
                low++;
            }
            
        }
        return res;
    }
}