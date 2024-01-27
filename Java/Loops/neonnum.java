import java.util.Scanner;
public class neonnum {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a neon number.");
        } else {
            System.out.println(num + " is not a neon number.");
        }
    }
}
