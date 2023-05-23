import java.util.Scanner;

public class BuzzNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isBuzzNumber(number)) {
            System.out.println(number + " is a buzz number.");
        } else {
            System.out.println(number + " is not a buzz number.");
        }

        scanner.close();
    }

    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }
}
