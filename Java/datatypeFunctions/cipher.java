import java.util.Scanner;
public class cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch, nch;
        int n;
        System.out.println("Enter a character: ");
        ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            n = (int)ch + 5;
        } else {
            n = (int)ch - 3;
        }
        nch = (char)n;
        System.out.println("The character after encryption is: " + nch);
    }
}
