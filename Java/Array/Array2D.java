import java.util.*;
class Array2D
{
    public static void main(String args[])
    {
        int n[][] = new int[3][5];
        int s[] = new int[3];
        int r, c;
        Scanner sc = new Scanner(System.in);
        for(r = 0; r <= 2; r++)
        {
            System.out.println("Enter the marks for student "+(r+1));
            for(c = 0; c <= 4; c++)
            {
                System.out.print("Enter Marks -> ");
                n[r][c] = sc.nextInt();
            }
        }
        for(r = 0; r <= 2; r++)
        {
            s[r] = 0;
            for(c = 0; c <= 4; c++)
            {
                s[r] = s[r] + n[r][c];
            }
        }
        for(r = 0; r <= 2; r++)
        {
            System.out.println("Marks Details of Student "+(r+1));
            for(c = 0; c <= 4; c++)
            {
                System.out.println(n[r][c]);
            }
            System.out.println("Total = "+s[r]);
        }
    }
}