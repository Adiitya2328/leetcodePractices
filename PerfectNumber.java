import java.util.Scanner;

public class PerfectNumber{

    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean result = checkPerfectNumber(num);

        if (result) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is NOT a Perfect Number");
        }

        sc.close();
    }
}
