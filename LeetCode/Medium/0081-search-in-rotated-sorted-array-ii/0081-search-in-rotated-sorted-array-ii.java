class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low =0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid] ==target){
                return true;
            }
            //this condition checks if all the numbers at position of low,high,mid are same then decrease high by one and increase low by 1 and then continue to check this thing again until we found different elements 
            if(nums[low] == nums[mid]&&nums[mid]==nums[high]){
                low =low+  1;
                high=high-1;
                continue;
            }
            //search in the left half
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high = mid-1;
                }else{
                    low=mid+1;
                }
            }
            //else search in the right half 
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    
    }
}