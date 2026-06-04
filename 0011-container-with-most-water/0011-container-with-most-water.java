class Solution {
    public int maxArea(int[] height) {
       int n = height.length; 
       int l = 0;
       int r = n-1;
       int area = 0;
       while(l<r){
            area = Math.max(area , (r-l)*Math.min(height[l] , height[r]));
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
       }

       return area;
    }
}