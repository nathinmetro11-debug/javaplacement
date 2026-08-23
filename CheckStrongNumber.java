import java.util.Scanner;

public class CheckStrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            sum = sum + factorial;
            number = number / 10;
        }

        if (sum == original) {
            System.out.println("The number is a strong number.");
        } else {
            System.out.println("The number is not a strong number.");
        }

        sc.close();
    }
}