// Addition based on OOPS concept
import java.util.*;
public class AdditionOnOOPS
{
    private int n1, n2, sum;
    public void getData()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        }
    }
    public void add()
    {
        sum = n1 + n2;
    }
    public void display()
    {
        System.out.println("Sum is " + sum);
    }
    public static void main(String args[])
    {
        AdditionOnOOPS a = new AdditionOnOOPS();
        a.getData();
        a.add();
        a.display();
    }
}