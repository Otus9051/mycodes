import java.util.Scanner;

public class twinprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        if (isTwinPrime(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are twin primes.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not twin primes.");
        }
    }
    
    public static boolean isTwinPrime(int num1, int num2) {
        if (isPrime(num1) && isPrime(num2) && Math.abs(num1 - num2) == 2) {
            return true;
        }
        return false;
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
