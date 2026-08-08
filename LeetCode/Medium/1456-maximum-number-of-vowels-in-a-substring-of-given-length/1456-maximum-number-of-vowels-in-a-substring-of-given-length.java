class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int low =0;
        int high =k-1;
        int count = 0;
        for(int i = low;i<=high ;i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                s.charAt(i) == 'u' ){
                    count++;
                }
        }
        int maxCount = count;
        while(high<n-1){
            if(s.charAt(low) == 'a' || s.charAt(low) == 'e' || s.charAt(low) == 'i' || s.charAt(low) == 'o' ||
                s.charAt(low) == 'u' ){
                    count--;
                }
                low++;
                high++;
            if(s.charAt(high) == 'a' || s.charAt(high) == 'e' || s.charAt(high) == 'i' || s.charAt(high) == 'o' ||
                s.charAt(high) == 'u' ){
                    count++;
                }

             maxCount =Math.max(maxCount,count);

        }
        return maxCount;

    }
}