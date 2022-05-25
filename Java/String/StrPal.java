import java.util.*;
class StrPal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str, revstr = "";
        System.out.print("Enter the String: ");
        str = sc.next();
        int l = str.length();
        int i;
        for(i = l - 1; i >= 0; i--)
        {
            revstr = revstr + str.charAt(i);
        }
        if(str.compareTo(revstr) == 0)
        {
            System.out.println("The String is a palindrome.");
        }
        else
        {
            System.out.println("The String is not a palindrome.");
        }
    }
}