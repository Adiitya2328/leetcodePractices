class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int low=0;
        int ans=0;
        int countT=0;
        int countF =0;//store the count of each T and F
        for(int high=0;high<n;high++){
            if(answerKey.charAt(high)=='T'){
                countT++;
            }else{
                countF++;
            }
            while(Math.min(countT,countF)>k){//if anyone of T or F becomes greater than k then decrement the same variable
                if(answerKey.charAt(low) =='T'){
                    countT--;
                }else{
                    countF--;
                }
                low++;
                
            }//calculate the maximum length answer by comparing with new length(high-low+1)
            ans =Math.max(high-low+1,ans);
        }
        return ans;
    }
}