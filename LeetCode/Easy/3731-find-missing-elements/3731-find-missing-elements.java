class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n=nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,1);
        }
        for(int i= min;i<max;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
    return list;
    }
}