class Solution {
    public int minimumRecolors(String blocks, int k) {
        int low = 0;
        int n = blocks.length();
        int high = k-1;
        int recolor;
        int min =Integer.MAX_VALUE;
        //simple sliding window approach
        //just find the number of W to recolor in every window and find what is the lowest by checking in every window
        while(high<n){
            recolor = 0;
            for(int i= low; i<=high ;i++){
                if(blocks.charAt(i) =='W'){
                    recolor++;
                }  
            }
            min = Math.min(min, recolor);
            low++;
            high++;
        }
        return min;
    }
}