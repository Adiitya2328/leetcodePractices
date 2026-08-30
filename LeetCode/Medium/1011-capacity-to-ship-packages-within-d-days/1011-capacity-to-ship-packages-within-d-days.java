class Solution {
    public int FindDays(int[] arr, int cap){
        int days =1; 
        int load = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+load>cap){
                days+=1;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low=Integer.MIN_VALUE;
        int high = 0;
        for(int i=0;i<n;i++){
            low = Math.max(low,weights[i]);
            high+=weights[i];
        }
        
        while(low<=high){
            int mid=(low+high)/2;
            int noOfDays = FindDays(weights,mid);
            if(noOfDays<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}