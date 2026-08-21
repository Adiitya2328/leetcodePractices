class Solution {
    public int findPeakElement(int[] nums) {
       int n=nums.length;
       int low =1;
       int high=n-2;
       if(n==1) return 0;//handle the edge cases directly 
       if(nums[0]>nums[1]) return 0;
       if(nums[n-1]>nums[n-2]) return n-1;
       while(low<=high){
            int mid=(low+high)/2;//here below if we find the peak at mid then return 
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
                //here we can see the curve is increasing means the peak is in the right so eliminate the left 
            }else if(nums[mid]>nums[mid-1]){
                low =mid+1;
            }  //here we can see the curve is decreasing means the peak is in the left so eliminate the right 
            else {
                high=mid-1;
            }
       } 
       return -1;
    }
}