import java.util.Scanner;
public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch, nch;
        System.out.println("Enter a character: ");
        ch = sc.next().charAt(0);
        nch = '0'; // To avoid error due to uninitialized variable
        if(Character.isUpperCase(ch)) {
            nch = Character.toLowerCase(ch);
            System.out.println("The character in lowercase is: " + nch);
            System.out.println("The ASCII value of the character is: " + (int)nch);
        } else if(Character.isLowerCase(ch)) {
            nch = Character.toUpperCase(ch);
            System.out.println("The character in uppercase is: " + nch);
            System.out.println("The ASCII value of the character is: " + (int)nch);
        } else {
            System.out.println("The character is not an alphabet.");
            System.out.println("The ASCII value of the character is: " + (int)nch);
        }
    }
}