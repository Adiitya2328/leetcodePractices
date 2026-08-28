class Solution {
    public int calculateTotalHours(int[] arr,int hrs){
        int totalHrs =0;
        int m=arr.length;
        for(int i=0;i<m;i++){
            totalHrs+=Math.ceil((double)arr[i]/(double)hrs);
        }
        return totalHrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid = (low+high)/2;
            int total = calculateTotalHours(piles, mid);
            if(total<=h){
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;

    }
}