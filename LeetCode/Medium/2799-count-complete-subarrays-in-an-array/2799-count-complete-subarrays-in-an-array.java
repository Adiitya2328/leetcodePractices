class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0; i<n;i++){//map to store the elements 
            map.put(nums[i] ,map.getOrDefault(nums[i],0)+1);
        }
        int k = map.size();//get the number of distinct elements just by the size of map
        int low=0;
        int ans = 0;
        //map to check whether the element is already present or not 
        HashMap<Integer ,Integer> check = new HashMap<>();
        //simple sliding window approach for the variable size window 
        for(int high =0; high<n;high++){
            check.put(nums[high],check.getOrDefault(nums[high],0)+1);
            //add all the elements of high in the check map
            while(check.size()==k){//whenever the size is equal to k
                ans +=n-high;//store the answer
                //remove the characters at low 
                check.put(nums[low] , check.get(nums[low])-1);
                if(check.get(nums[low]) == 0){
                    check.remove(nums[low]);
                }

                low++;
            }
        }
        return ans;
    }
}