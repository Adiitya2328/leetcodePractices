import java.util.Arrays;

public class Main {

    // Rotate Method
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] a = new int[n];

        k = k % n;

        for(int i = 0; i < n; i++){
            int newIndex = (i + k) % n;
            a[newIndex] = nums[i];
        }

        for(int i = 0; i < n; i++){
            nums[i] = a[i];
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array: " + Arrays.toString(nums));

        rotate(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}