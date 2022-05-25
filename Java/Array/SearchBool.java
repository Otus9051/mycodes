import java.util.*;
class SearchBool
{
    public static void main(String args[])
    {
        int n[] = new int[5];
        int i, sn;
        boolean found = false;
        Scanner sc=new Scanner(System.in);
        for(i = 0; i <= 4; i++)
        {
            System.out.print("Enter No -> ");
            n[i] = sc.nextInt();
        }
        System.out.print("Enter your search no -> ");
        sn = sc.nextInt();
        for(i = 0; i <= 4; i++)
        {
            if(sn == n[i])
            {
                found = true;
                break;
            }
        }
        if(found == true)
        {
            System.out.println(sn+ " is found");
        }
        else
        {
            System.out.println(sn+ " is not found");
        }
    }
}