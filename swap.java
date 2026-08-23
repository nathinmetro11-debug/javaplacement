public class swap {
    public static void main(String[] args) {

        System.out.println("Before swapping");

        int first = 10;
        int second = 50;

        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After swapping");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }
}