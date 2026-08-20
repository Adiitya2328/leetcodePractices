class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1){//edge case if there is a single element in array 
            return nums[0];
        }//explicitly handle the first and last element in array
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int low=1;//initiallize the low from second element and the high from the second last element to properly check left and right 
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }            //if we are in the left 
            if((mid%2!=0 && nums[mid]==nums[mid-1]) 
            || (mid%2==0&&nums[mid]==nums[mid+1])){
                low=mid+1;
            }else{//if we are in the right 
                high=mid-1;
            }
        }
        return -1;
    }
}