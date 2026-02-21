import java.util.Scanner;

public class PowerOfFourChecker {

    
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        PowerOfFourChecker checker = new PowerOfFourChecker();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a power of 4: ");
        int num = sc.nextInt();

        if (checker.isPowerOfFour(num)) {
            System.out.println(num + " is a power of 4.");
        } else {
            System.out.println(num + " is NOT a power of 4.");
        }

        sc.close();
    }
}