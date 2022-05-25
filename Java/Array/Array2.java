import java.util.*;
class Array2
{
    public static void main(String args[])
    {
        int n[] = new int[5];
        int i, s = 0, avg;
        Scanner sc=new Scanner(System.in);
        for (i = 0; i <= 4; i++)
        {
            System.out.println("Enter your marks: ");
            n[i] = sc.nextInt();
        }
        for (i = 0; i <= 4; i++)
        {
            s = s+n[i];
        }
        avg = s/5;
        System.out.println("Sum of 5 numbers is "+s);
        System.out.println("Average is "+avg);
    }
}