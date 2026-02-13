import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length / 2;
        return nums[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result);

        
    }
}
