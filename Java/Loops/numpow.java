import java.util.Scanner;

public class numpow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three-digit number:");
        int num = scanner.nextInt();

        int n3 = num % 10;
        num /= 10;
        int n2 = num % 10;
        num /= 10;
        int n1 = num % 10;

        System.out.println(n1 + "^1 = " + (int)Math.pow(n1, 1));
        System.out.println(n2 + "^2 = " + (int)Math.pow(n2, 2));
        System.out.println(n3 + "^3 = " + (int)Math.pow(n3, 3));
    }
}