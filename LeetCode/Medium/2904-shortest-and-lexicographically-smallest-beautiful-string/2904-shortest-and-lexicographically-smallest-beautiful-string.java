class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int low =0;
        int len = Integer.MAX_VALUE;
        String ans ="";
        //basic variable size sliding window approach to move 
        for(int high=0;high<s.length();high++){
            char Highch = s.charAt(high);
            if(Highch == '1'){
                map.put(Highch , map.getOrDefault(Highch,0)+1);
            }
            while(map.getOrDefault('1',0)>k){
                char Lowch = s.charAt(low);
                if(map.containsKey(Lowch)){
                    map.put(Lowch , map.get(Lowch)-1);
                    if(map.get(Lowch) == 0){
                        map.remove(Lowch);
                    }
                }
                low++;
                
            }
             if (map.getOrDefault('1', 0) == k) {
                // Skip those  unnecessary zeroes from left
                while (s.charAt(low)=='0') {
                    low++;
                }//checking the length of substring and comparing with the smallest
                int curLen = high-low+1;
                if(curLen <len){
                    len= curLen;
                    ans = s.substring(low,high+1);//storing the answer 
                }else if(curLen==len){//in case of same we use compareTo function
                    String current = s.substring(low,high+1);
                    if(current.compareTo(ans)<0){
                        ans = current;
                    }
                }
             }
        }
        
        return ans;
    }
}