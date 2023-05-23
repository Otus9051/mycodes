import java.util.*;
class StrSubUsr
{
    public static void main(String args[])
    {
        String name;
        int i, j;
        System.out.println("Enter your name: ");
        try (Scanner sc = new Scanner(System.in)) {
            name = sc.next();
        }
        for (i = 0, j = 1; i < name.length(); i++, j++)
        {
            System.out.println(name.substring(i,j));
        }
    }
}