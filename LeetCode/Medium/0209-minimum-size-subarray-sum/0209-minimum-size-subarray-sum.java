class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int low=0;
        int sum=0;//simple variable size sliding window approach
        int res = Integer.MAX_VALUE;
        for(int high=0;high<n;high++){
            sum+=nums[high];//add the nums value at each high
            while(sum>=target){//when the sum exceeds target 
                int len= high-low+1;//calculate the length
                res =Math.min(len,res);//check it is smallest or not 
                sum-=nums[low];//decrement the element at low 
                low++;//increment low
            }
        }
        if(res ==Integer.MAX_VALUE){//one edge case to check
            return 0;
        }
        return res;
    }
}