class Solution {
    public String reverseWords(String s) {
        s =s.trim();
        int n = s.length();
        int first = n-1;
        int last =n-1;
        String ans="";
        for(int i=n-1;i>=0;i--){
            
            if(s.charAt(i) == ' '){
                if(i<last){
                    ans+= s.substring(i+1,last+1);
                    ans+=" ";
                
                }
                last = i-1;
            }
        }
        ans+=s.substring(0,last+1);
        return ans;
    }
}