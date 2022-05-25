import java.util.*;
class Array3
{
    public static void main(String args[])
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        int n[];
        int i, s = 0, avg;
        System.out.print("Enter your choice ");
        ch = sc.nextInt();
        n = new int[ch];
        for (i = 0; i < ch; i++)
        {
            System.out.println("Enter your marks: ");
            n[i] = sc.nextInt();
        }
        for (i = 0; i < ch; i++)
        {
            s = s+n[i];
        }
        avg = s/ch;
        System.out.println("Sum of 5 numbers is "+s);
        System.out.println("Average is "+avg);
    }
}