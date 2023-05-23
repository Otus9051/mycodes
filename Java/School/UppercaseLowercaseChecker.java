import java.util.Scanner;

public class UppercaseLowercaseChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        if (Character.isUpperCase(character)) {
            System.out.println(character + " is an uppercase letter.");
        } else if (Character.isLowerCase(character)) {
            System.out.println(character + " is a lowercase letter.");
        } else {
            System.out.println("The entered character is not a letter.");
        }

        scanner.close();
    }
}
