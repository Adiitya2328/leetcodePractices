class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer , Integer> freq = new HashMap<>();
        int sum = 0;
        int count=0;
        freq.put(0,1); //freq of the subarray containig zero elements is one
        for(int i = 0 ; i< n ; i++){
            sum+= nums[i]; //calculate every previous sum 
            int val = sum-k;// if val occurs in the array means the k will also in the array 
            if(freq.containsKey(val)){//if it contains the sum then increase count
                count+=freq.get(val);
            }
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }
        return count;
        
    }
}