import java.util.ArrayList;
import java.util.List;
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets( int[] nums) {
        fun(0,nums,new ArrayList<>());
        return ans;
    }
    public void fun(int ind,int[] nums, List<Integer> list){
        if(ind==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[ind]);//for picking
        fun(ind+1,nums,list);

        list.remove(list.size()-1);//for not picking
        fun(ind+1,nums,list);
    }
}