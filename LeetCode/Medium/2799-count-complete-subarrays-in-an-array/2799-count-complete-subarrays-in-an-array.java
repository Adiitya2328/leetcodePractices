class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0; i<n;i++){
            map.put(nums[i] ,map.getOrDefault(nums[i],0)+1);
        }
        int k = map.size();
        int low=0;
        int ans = 0;
        HashMap<Integer ,Integer> check = new HashMap<>();
        for(int high =0; high<n;high++){
            check.put(nums[high],check.getOrDefault(nums[high],0)+1);

            while(check.size() == k){
                ans +=n-high;
                check.put(nums[low] , check.get(nums[low])-1);
                if(check.get(nums[low]) == 0){
                    check.remove(nums[low]);
                }

                low++;
            }
        }
        return ans;
    }
}