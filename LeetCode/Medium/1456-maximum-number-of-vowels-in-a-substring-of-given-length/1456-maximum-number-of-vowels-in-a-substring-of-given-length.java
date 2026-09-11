class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int low=0;
        int high = k-1;
        int count=0;
        for(int i=low;i<=high;i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        int maxCount=count;
        while(high<n-1){
            char ch =s.charAt(low);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count--;
            }
            low++;
            high++;
            char c = s.charAt(high);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
            maxCount=Math.max(count,maxCount);
            
        }
        return maxCount;
    }
}