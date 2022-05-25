import java.util.*;
class StrCharAt
{
    public static void main(String args[])
    {
        String str;
        System.out.println("Enter your sentence");
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        System.out.println("The 1st Character of the sentence is "+str.charAt(0));
    }
}