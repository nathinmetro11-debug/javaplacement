import java.util.Scanner;

public class CountOccurrenceOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter the digit to count: ");
        int search = sc.nextInt();

        int count = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit == search) {
                count++;
            }

            number = number / 10;
        }

        System.out.println("Occurrence = " + count);

        sc.close();
    }
}