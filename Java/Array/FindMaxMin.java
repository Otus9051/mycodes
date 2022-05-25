import java.util.*;
class FindMaxMin
{
    public static void main(String args[])
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        int n[];
        int i, max, min;
        System.out.print("Enter your choice ");
        ch = sc.nextInt();
        n = new int[ch];
        for(i=0; i<ch; i++)
        {
            System.out.print("Enter no -> ");
            n[i] = sc.nextInt();
        }
        max = n[0];
        min = n[0];
        for(i=1; i<ch; i++)
        {
            if(n[i] > max)
            {
                max = n[i];
            }
            if(n[i] < min)
            {
                min = n[i];
            }
        }
        System.out.println("Max and Min no are "+max+", "+min);
    }
}