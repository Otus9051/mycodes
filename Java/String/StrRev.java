import java.util.*;
class StrRev
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the String: ");
        str = sc.next();
        int l = str.length();
        int i;
        for(i = l - 1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}