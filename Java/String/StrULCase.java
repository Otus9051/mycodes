import java.util.*;
class StrULCase
{
    public static void main(String args[])
    {
        String usrtxt, uctxt, lctxt;
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        usrtxt = sc.next();
        uctxt = usrtxt.toUpperCase();
        lctxt = usrtxt.toLowerCase();
        System.out.println("Your original word is "+usrtxt);
        System.out.println("Your word in Uppercase is "+uctxt);
        System.out.println("Your word in Lowercase is "+lctxt);
    }
}