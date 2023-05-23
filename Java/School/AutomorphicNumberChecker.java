import java.util.Scanner;

public class AutomorphicNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isAutomorphicNumber(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        scanner.close();
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String originalNumberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(originalNumberStr);
    }
}
