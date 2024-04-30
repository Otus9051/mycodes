import java.util.Scanner;
public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character: ");
        ch = sc.next().charAt(0);
        if(Character.isLetter(ch)) {
            if(Character.isUpperCase(ch)) {
                System.out.println("The character is in uppercase.");
            } else if(Character.isLowerCase(ch)) {
                System.out.println("The character is in lowercase.");
            } else {
                System.out.println("The character is not an alphabet.");
            }
        }
        else {
            if(Character.isDigit(ch)) {
                System.out.println("The character is a digit.");
            }
            else if(Character.isWhitespace(ch)) {
                System.out.println("The character is whitespace character.");
            }
            else {
                System.out.println("The character is a special character.");
            }
        }
    }
}