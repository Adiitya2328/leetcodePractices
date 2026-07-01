class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int low = 0;
        int high  =n-k;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int i = 0 ; i<n ; i++){
            total+= cardPoints[i];
        }
        while (high <= n){
            int sum = 0;
            
            for(int i = low; i<high ; i++){
                sum += cardPoints[i];
            }
            max = Math.max(max,total- sum);
            low++;
            high++;
        }
        return max;
    }
}