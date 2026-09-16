class Solution {
    public int longestOnes(int[] nums, int k) {
        int low=0;
        int countZero=0;
        int maxLen= Integer.MIN_VALUE;
        for(int high=0;high<nums.length;high++){
            int numsHigh=nums[high];
            if(numsHigh==0){
                countZero++;
            }
            while(countZero>k){
                int numsLow=nums[low];
                if(numsLow==0){
                    countZero--;
                }
                
                low++;
            }
            maxLen=Math.max(maxLen,high-low+1);
        }
        return maxLen;
    }
}