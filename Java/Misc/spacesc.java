import java.util.Scanner;
public class spacesc {
    public static void main(String args[]) {
        String s;
        int c = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string");
            s = sc.nextLine();
        }
        System.out.println("The string is: " + s);
        System.out.println("The string length is: " + s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println("Space found at position: " + i);
                c++;
            }
        }
        System.out.println("The number of spaces in the string is: " + c);
    }
}
