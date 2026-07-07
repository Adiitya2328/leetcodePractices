class Solution {
    public int flip(int m){
        if (m ==0){
            m=1;
        }else{
            m =0;
        }
        return m;
    }
    public int minOperations(int[] nums) {
        int low = 0;
        int high = 3;
        int n = nums.length;
        int count =0;
        while(high<=n){
            if(nums[low] ==0){
                for(int i = low ; i<high;i++){
                nums[i]=flip(nums[i]);
                
            } count++;
            }
              low++;
                high++;
              
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=nums[i];

        }
        if(sum == n){
            return count;
        }
        return -1;
        
    }
}