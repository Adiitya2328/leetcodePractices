class Solution {
    //created this function to calculate the sum of the divisors of all element by any number 
    public int SumOfDiv(int[] arr, int div){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)arr[i]/(double)div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        //it is totally clear that the answer would lie between the range 
        int low=1;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            high = Math.max(high,nums[i]);
        }
    //simply applie the BS on answwers to find out the smallest divisor in the given range    
        while(low<=high){
            int mid=(low+high)/2;
            if(SumOfDiv(nums,mid)<=threshold){
                high=mid-1;
            }else{
                low =mid+1;
            }
        }
        return low;
    }
}