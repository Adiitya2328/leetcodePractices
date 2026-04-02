import java.util.*;

public class PartitionArray {

    public static void main(String[] args) {
        
        
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;

        
        Solution sol = new Solution();
        int[] result = sol.pivotArray(nums, pivot);

        
        System.out.println(Arrays.toString(result));
    }
}

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];

        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();
        LinkedList<Integer> equal = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                left.add(nums[i]);
            } else if (nums[i] > pivot) {
                right.add(nums[i]);
            } else {
                equal.add(nums[i]);
            }
        }

        left.addAll(equal);
        left.addAll(right);

        for (int j = 0; j < nums.length; j++) {
            ans[j] = left.get(j);
        }

        return ans;
    }
}