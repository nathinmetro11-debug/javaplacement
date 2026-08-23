import java.util.Scanner;

public class CheckNeonNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int square = number * number;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        if (sum == number) {
            System.out.println("The number is a neon number.");
        } else {
            System.out.println("The number is not a neon number.");
        }

        sc.close();
    }
}
