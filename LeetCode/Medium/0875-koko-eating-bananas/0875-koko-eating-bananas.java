class Solution {
    public int calculateTotalHours(int[] arr,int hrs){
        int totalHrs =0;
        int m=arr.length;
        for(int i=0;i<m;i++){
            totalHrs+=Math.ceil((double)arr[i]/(double)hrs);
        }
        return totalHrs;
        //simply created a different function to calculate how many total hrs it will take with this array
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        //calculate the highest in the array this will decide the range of the BS
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        int low=1;
        int high=max;//initialized the range in the BS
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