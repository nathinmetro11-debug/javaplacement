import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == number) {
            System.out.println("The number is a perfect number.");
        } else {
            System.out.println("The number is not a perfect number.");
        }

        sc.close();
    }
}