import java.util.*;
class String1
{
    public static void main(String args[])
    {
        String StrPass;
        int len;
        System.out.println("Enter your password");
        Scanner sc = new Scanner(System.in);
        StrPass = sc.next();
        len = StrPass.length();
        if (len >= 8)
        {
            System.out.print("It is a strong password with "+len+ " characters.");
        }
        else
        {
            System.out.print("Please add more than 8 characters to make a strong password" +len+ " characters.");
        }
    }
}