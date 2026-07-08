class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] prefix =new int[n];
        prefix[0] =nums[0];
        for(int i= 1;i<n;i++){
            prefix[i] =prefix[i-1]+nums[i];
        }
        int totalSum = prefix[n-1];
        for(int i = 0;i<n;i++){
            int leftsum=0;
            if(i>0){
                leftsum =prefix[i-1];
            }
            int rightSum = totalSum -prefix[i];
            int left = nums[i]*i- leftsum;
            int right = rightSum - nums[i]*(n-i-1);

            res[i] = left+right;
        }
        return res;
    }
}