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
           //first of all above created a function to check if it is possible to get those no of bouqeuts 
            
        }
        noOfBQ += (count/b);
        return noOfBQ >= a;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long)m*k;//one edge case if m*k > size of array
        if(val>bloomDay.length){
            return -1;
        }//figure out the range of answer will be between max and min of array
        int minm = Integer.MAX_VALUE;
        int maxm = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            minm = Math.min(minm,bloomDay[i]);
            maxm = Math.max(maxm,bloomDay[i]);
        }
        int low = minm;
        int high=maxm;//applied the BS to find out the perfect answer lying between the range 
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