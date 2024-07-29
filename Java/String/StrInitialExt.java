import java.util.Scanner;

public class StrInitialExt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name = sc.nextLine();
        String[] words = name.split(" ");
        String initials = "";
        
        for (int i = 0; i < words.length; i++) {
            initials += words[i].charAt(0) + ". ";
        }
        
        // Append the last word as the surname
        initials += words[words.length - 1];
        
        System.out.println("Initials with surname: " + initials);
    }
}