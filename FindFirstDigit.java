import java.util.Scanner;

public class FindFirstDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        while (number >= 10) {
            number = number / 10;
        }

        System.out.println("First digit = " + number);

        sc.close();
    }
}
