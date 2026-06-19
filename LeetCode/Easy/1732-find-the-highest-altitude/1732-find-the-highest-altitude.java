class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int res = Integer.MIN_VALUE;
        int[] prefixSum = new int[n+1];
        prefixSum[0] = 0;
        for(int i = 1; i<n+1;i++){
            prefixSum[i] = prefixSum[i-1]+gain[i-1];

        }
        for(int i = 0; i<prefixSum.length;i++){
            res = Math.max(res, prefixSum[i]);
        }
        return res;
    }
}