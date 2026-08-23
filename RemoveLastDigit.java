import java.util.Scanner;

public class RemoveLastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = number / 10;

        System.out.println("After removing last digit = " + number);

        sc.close();
    }
}