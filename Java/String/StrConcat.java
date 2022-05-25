import java.util.*;
class StrConcat
{
    public static void main(String args[])
    {
        String firstName, lastName, finalName;
        System.out.println("Enter your first name: ");
        Scanner sc = new Scanner(System.in);
        firstName = sc.next();
        System.out.println("Enter your last name: ");
        lastName = sc.next();
        finalName = firstName.concat(" ");
        finalName = finalName.concat(lastName);
        System.out.println("Your full name is "+finalName);
    }
}