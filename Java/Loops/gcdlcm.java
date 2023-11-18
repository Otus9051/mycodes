import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int gcd = 0, lcm = 0;
        int choice;
        System.out.println("1. Find GCD");
        System.out.println("2. Find LCM");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                gcd = findGCD(num1, num2);
                System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
                break;
            case 2:
                lcm = findLCM(num1, num2);
                System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }
        sc.close();
    }

    public static int findGCD(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        return num1;
    }

    public static int findLCM(int num1, int num2) {
        int gcd = findGCD(num1, num2);
        int lcm = (num1 * num2) / gcd;
        return lcm;
    }
}
