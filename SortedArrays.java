
class check {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}

public class SortedArrays {
    public static void main(String[] args) {
        check obj = new check();

        int[] nums = {3, 4, 5, 1, 2};  // Change this array to test other cases

        boolean result = obj.check(nums);
        System.out.println("Is sorted and rotated? " + result);
    }
}