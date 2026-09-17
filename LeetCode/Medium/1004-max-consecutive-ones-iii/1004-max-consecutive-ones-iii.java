class Solution {
    public int longestOnes(int[] nums, int k) {
        int low=0;
        int countZero=0;
        int maxLen= Integer.MIN_VALUE;
        for(int high=0;high<nums.length;high++){
            int numsHigh=nums[high];
            if(numsHigh==0){//whenever we face the element is 0 we will increase 
                countZero++;
            }
            while(countZero>k){
                int numsLow=nums[low];
                if(numsLow==0){//if the element at low ==0 decrement
                    countZero--;
                }
                
                low++;
            }
            maxLen=Math.max(maxLen,high-low+1);//compare and store the max Length
        }
        return maxLen;
    }
}