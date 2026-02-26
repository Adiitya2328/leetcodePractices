class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}

public class deleteDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        Solution sol = new Solution();
        int newLength = sol.removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + newLength);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}