class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }Arrays.sort(nums);
        int low=0;
        int high=k-1;
        int Mindiff=Integer.MAX_VALUE;
        while(high<nums.length){
            int diff = nums[high]-nums[low];
            Mindiff = Math.min(Mindiff,diff);
            low++;
            high++;
        }
        return Mindiff;
    }
}