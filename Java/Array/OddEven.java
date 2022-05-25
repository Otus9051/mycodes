import java.util.*;
class OddEven
{
    public static void main(String args[])
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        int n[];
        int i, odd = 0, even = 0;
        System.out.print("Enter your choice ");
        ch = sc.nextInt();
        n = new int[ch];
        for(i = 0; i < ch; i++)
        {
            System.out.print("Enter no -> ");
            n[i] = sc.nextInt();
        }
        for(i = 0; i < ch; i++)
        {
            if(n[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Total no of odd and even" +odd+ ", " +even);
    }
}