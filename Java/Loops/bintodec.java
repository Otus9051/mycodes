import java.util.Scanner;
public class bintodec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String binary = sc.nextLine();
        sc.close();
        int decimal = 0;
        for (int i = binary.length() - 1, j = 0; i >= 0; i--, j++) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, j);
        }
        System.out.println("Decimal: " + decimal);
    }
}