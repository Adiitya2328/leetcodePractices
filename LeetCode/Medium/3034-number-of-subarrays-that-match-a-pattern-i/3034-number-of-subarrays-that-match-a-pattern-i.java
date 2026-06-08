class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n = nums.length;
        int m = pattern.length;
        int count = 0;
        int[] dif = new int[n-1];

        for(int i = 0 ; i<n-1 ; i++){
            if(nums[i+1 ] >nums[i]){
                dif[i] = 1;
            }else if(nums[i+1] == nums[i]){
                dif[i] =0;
            }else if(nums[i+1] < nums[i]){
                dif[i] = -1;
            }
        }
        for(int high = 0 ; high<=dif.length - m;high++){
            boolean found = true;
            for(int i = 0 ; i<m ; i++){
                if(dif[high+i] != pattern[i]){
                    found = false;
                    break;
                }
            }
            if(found){
                count++;
            }
        }
        return count;
    }
}