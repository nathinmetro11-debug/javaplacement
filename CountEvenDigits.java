import java.util.Scanner;

public class CountEvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                count++;
            }

            number = number / 10;
        }

        System.out.println("Even digits = " + count);

        sc.close();
    }
}
