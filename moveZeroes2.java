import java.util.Arrays;

public class moveZeroes2 {

    public void moveZeroes(int[] nums) {
        int j = -1;

        // Find first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return;

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        moveZeroes2 obj = new moveZeroes2();

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before: " + Arrays.toString(nums));

        obj.moveZeroes(nums);

        System.out.println("After:  " + Arrays.toString(nums));
    }
}