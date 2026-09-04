class Solution {//can be solved by the same approach of BOOK ALLOCATION
//The first thing i need to do is to find the count of subarrays
    public int countSubarrays(int[] arr,long maxSum){
        int subarrays=1;
            long currentSum =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+currentSum<=maxSum){
                currentSum+=arr[i];

            }else{
                subarrays+=1;
                currentSum= arr[i];
            }
        }
        return subarrays;
    }
    
    public int splitArray(int[] nums, int k) {
        if(nums.length<k){//handle the edge case 
            return -1;
        }
        long low=0;//the range of search will be from the max element in the array(low) to the sum of all elements in the array(high)
        long high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            long mid=(low+high)/2;
            int subarray = countSubarrays(nums,mid);
            if(subarray>k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return (int)low;

    }
}