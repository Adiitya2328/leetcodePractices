class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int low = 0;
        int high = n-k;
        int max = Integer.MIN_VALUE;
        int total = 0;
        int sum = 0;
        for(int i = 0 ; i<n; i++){//calculate the total points
            total += cardPoints[i]; 
        }
        for(int i = low ; i< high; i++){
            sum += cardPoints[i];//calculate the total points of window 
        }
        max = total - sum; //initialize the sum
        while(high< n ){
            sum = sum - cardPoints[low]+cardPoints[high];
            //decrement the point at low and increment the point at high
            max = Math.max(max , total - sum);//recalculate the new max;
            low++;
            high++;
        }
        return max;
    }
}