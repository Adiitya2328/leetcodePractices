import java.util.Scanner;

public class climbStairs {

    public static int climbStair(int n) {
        if (n <= 1) return 1;

        int prev2 = 1; // ways to reach (i-2)
        int prev1 = 1; // ways to reach (i-1)

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(climbStair(n));
    }
}
