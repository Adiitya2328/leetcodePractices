class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low =0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid] ==target){
                return mid;
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
        return -1;
    }
}