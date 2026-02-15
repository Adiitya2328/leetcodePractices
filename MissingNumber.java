import java.util.Scanner;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int RealSum = (n * (n + 1)) / 2;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }

        return RealSum - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

       
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = missingNumber(nums);
        System.out.println("Missing number is: " + result);

        sc.close();
    }
}
