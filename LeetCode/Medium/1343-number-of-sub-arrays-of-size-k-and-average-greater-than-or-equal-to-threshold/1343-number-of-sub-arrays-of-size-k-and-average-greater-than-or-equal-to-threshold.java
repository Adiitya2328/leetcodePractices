class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
      int n=arr.length;
      int low =0;
      int high =k-1;
      int count =0;
      int sum=0;
      for(int i=low;i<=high;i++){
            sum+=arr[i];//calculate the sum for the window size 
      }  
      while(high<n){
        int avg = sum/k;//calculated the avg each time 
        if(avg>=threshold){//if avg is greater than or equal to threshold
            count++;//increment the count of array 
        }
        sum-=arr[low];//decrement the sum from the lowest pointer 
        low++;//move pointer 
        high++;
        if(high<n){
            sum+=arr[high];
        }
      }
      return count;
    }
}