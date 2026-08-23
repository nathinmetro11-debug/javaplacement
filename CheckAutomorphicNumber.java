import java.util.Scanner;

public class CheckAutomorphicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int square = number * number;

        if (square % 10 == number % 10) {
            System.out.println("The number is an automorphic number.");
        } else {
            System.out.println("The number is not an automorphic number.");
        }

        sc.close();
    }
}