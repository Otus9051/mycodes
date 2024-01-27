import java.util.Scanner;

public class concat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 7-digit number: ");
        int number = scanner.nextInt();

        int firstThreeDigits = number / 10000;
        int lastThreeDigits = number % 1000;

        System.out.println(firstThreeDigits);
        System.out.println(lastThreeDigits);

        int difference = firstThreeDigits - lastThreeDigits;

        System.out.println("Difference: " + difference);

        scanner.close();
    }
}
