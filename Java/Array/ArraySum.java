import java.util.*;
class ArraySum
{
    public static void main(String args[])
    {
        int n1[] = new int[5];
        int n2[] = new int[5];
        int n3[] = new int[5];
        int i;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for 1st array: ");
        for(i = 0; i <= 4; i++)
        {
         System.out.print("Enter No -> ");
         n1[i] = sc.nextInt();
        }
        System.out.println("Enter the values for 2nd array: ");
        for(i = 0; i <= 4; i++)
        {
         System.out.print("Enter No -> ");
         n2[i] = sc.nextInt();
        }
        for(i = 0; i <= 4; i++)
        {
            n3[i] = n1[i] + n2[i];
        }
        System.out.println("Total index wise sum number in 3rd array: ");
        for(i = 0; i <= 4; i++)
        {
            System.out.println(n1[i] + " + " + n2[i] + " = " + n3[i]);
        }
    }
}