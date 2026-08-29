class Solution {
    public boolean possible(int[] arr,int day, int a , int b){
        int count=0;
        int noOfBQ=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }else{
                noOfBQ+=(count/b);
                count=0;
            }
            
            
        }
        noOfBQ += (count/b);
        return noOfBQ >= a;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long)m*k;
        if(val>bloomDay.length){
            return -1;
        }
        int minm = Integer.MAX_VALUE;
        int maxm = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            minm = Math.min(minm,bloomDay[i]);
            maxm = Math.max(maxm,bloomDay[i]);
        }
        int low = minm;
        int high=maxm;
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(bloomDay, mid,m ,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}