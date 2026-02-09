import java.util.Scanner;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int[] news = new int[nums.length];
        news[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            news[i] = news[i - 1] + nums[i];
        }

        return news;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        int[] nums = new int[n];

        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        int[] result = runningSum(nums);

        
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
