import java.util.Scanner;

public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean result = isPowerOfThree(n);

        System.out.println("Is Power of Three? " + result);

        sc.close();
    }
}