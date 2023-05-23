import java.util.Scanner;

public class NumberComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double largest;
        double smallest;

        if (num1 > num2) {
            largest = num1;
            smallest = num2;
        } else {
            largest = num2;
            smallest = num1;
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        scanner.close();
    }
}
