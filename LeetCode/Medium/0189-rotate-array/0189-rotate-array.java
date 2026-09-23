class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       int[] a = new int[n];

       k= k%n;
       for(int i= 0; i<n;i++){
        int newIndex = (i+k)%n;
        a[newIndex] = nums[i];
       }
       for(int i = 0; i < n; i++){
            nums[i] = a[i];
        }
    }
}