import java.util.Scanner;
public class niven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int s = 0;
        int tmp = n;

        while (tmp > 0) {
            int digit = tmp % 10;
            s += digit;
            tmp /= 10;
        }

        if (n % s == 0) {
            System.out.println(n + " is a Niven number.");
        } else {
            System.out.println(n + " is not a Niven number.");
        }
    }
}
