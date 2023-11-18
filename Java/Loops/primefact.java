import java.util.Scanner;
public class primefact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Prime factors of " + n + " are: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n /= i;
            }
        }
    }
}