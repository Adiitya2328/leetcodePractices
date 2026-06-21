class Solution {
    public int maxDistance(String moves) {
        int n = moves.length();
        int x= 0;
        int y = 0;
        int count =0;
        for(int i = 0 ; i< n ; i++){
            char ch = moves.charAt(i);
            if(ch == 'U'){
                y++;
            }else if(ch == 'D'){
                y--;
            }else if(ch == 'L'){
                x--;
            }else if(ch == 'R'){
                x++;
            }else{
                count++;
            }
        }
        int finalDist = Math.abs(x) + Math.abs(y) + count;
        return finalDist;
    }
}