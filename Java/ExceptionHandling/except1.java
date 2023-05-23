import java.util.InputMismatchException;
import java.util.Scanner;
class except1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1, n2, res;
            System.out.println("Enter two numbers");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            try {
                res = n1 / n2;
                System.out.println("Result = " + res);
            } catch (InputMismatchException e) {
                System.out.println("System Message = " + e.getMessage());
                System.out.println("User Message = Input value is not Numeric");
            } catch (ArithmeticException e) {
                System.out.println("System Message = " + e.getMessage());
                System.out.println("User Message = You cannot divide a number by zero");
            }
            finally {
                System.out.println("Thank you for using this program");
            }
        }
    }
}