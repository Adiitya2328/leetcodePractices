class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);

    }
    public int atMost(int[] nums,int k){
        HashMap<Integer,Integer> map =new HashMap<>();
        int low=0;
        int ans=0;
        int count=0;
        for(int high=0;high<nums.length;high++){
            int numH = nums[high];
            map.put(numH,map.getOrDefault(numH,0)+1);
             
            while(map.size()>k){
                int numL=nums[low];
                map.put(numL, map.get(numL)-1);
                if(map.get(numL)==0){
                    map.remove(numL);
                }
                low++;
                
            }
            ans+=high-low+1;
        }
        return ans;
    }
}