class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        int longest = Integer.MIN_VALUE;
        int low=0;
        for(int high =0;high<n;high++){
            int num = nums[high];
            freq.put(num,freq.getOrDefault(num,0)+1);
            while(freq.get(num)>k){
                int lowNum =nums[low];
                freq.put(lowNum,freq.get(lowNum)-1);
                low++;
                
                
            }
            longest=Math.max(longest,high-low+1);
        }
        return longest;
    }
}