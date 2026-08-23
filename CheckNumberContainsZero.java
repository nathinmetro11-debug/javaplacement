import java.util.Scanner;

public class CheckNumberContainsZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean found = false;

        while (number > 0) {
            int digit = number % 10;

            if (digit == 0) {
                found = true;
                break;
            }

            number = number / 10;
        }

        if (found) {
            System.out.println("The number contains 0.");
        } else {
            System.out.println("The number does not contain 0.");
        }

        sc.close();
    }
}
