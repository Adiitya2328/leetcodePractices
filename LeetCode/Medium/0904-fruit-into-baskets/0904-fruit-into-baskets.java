class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int low=0;
        int maxLen=0;
        //store the fruits with their frequencies in hashmap
        HashMap <Integer,Integer> map=new HashMap<>();
        //simple sliding window approach for the variable size window 
        for(int high=0;high<n;high++){
            int num =fruits[high]; 
            map.put(num,map.getOrDefault(num,0)+1);
            while(map.size()>2){//if the number of baskets increase more than 2
                int numLow=fruits[low];//decrement at low
                map.put(numLow,map.get(numLow)-1);
                if(map.get(numLow)==0){
                    map.remove(numLow);
                }
                low++;
            }
            maxLen=Math.max(high-low+1,maxLen);//calculate the max length
        }
        return maxLen;
    }
}