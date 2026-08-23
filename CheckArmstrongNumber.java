import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        if (sum == original) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }

        sc.close();
    }
}