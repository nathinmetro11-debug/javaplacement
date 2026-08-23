import java.util.Scanner;

public class FindSmallestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int smallest = 9;

        while (number > 0) {
            int digit = number % 10;

            if (digit < smallest) {
                smallest = digit;
            }

            number = number / 10;
        }

        System.out.println("Smallest digit = " + smallest);

        sc.close();
    }
}
