class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        int low=0;
        int high=n-1;
        int LB =-1;
        int UB = -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                if(nums[mid] == target)LB= mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        low=0;
        high=n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target)UB = mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        ans[0] = LB;
        ans[1] = UB;
        return ans; 
    }
}