class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2];
        int pos = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int  i =0 ; i<n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0) +1);
        }
        for(int i : map.keySet()){
            if(map.get(i) > 1){
                arr[pos] = i;
                pos++;
            }
        }
         return arr;
    }
}