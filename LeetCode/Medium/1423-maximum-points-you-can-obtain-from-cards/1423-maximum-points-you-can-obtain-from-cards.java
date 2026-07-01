class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int low = 0;
        int high  =n-k;//the window size is n-k because we have to take that window which have smallest value
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int i = 0 ; i<n ; i++){
            total+= cardPoints[i];//calculate the total points of card
        }
        while (high <= n){
            int sum = 0;
            
            for(int i = low; i<high ; i++){
                sum += cardPoints[i];
            }
            max = Math.max(max,total- sum);//reduce the window sum which is smallest from total to get the max value and with max function find out the largest sum
            low++;
            high++;
        }
        return max;
    }
}