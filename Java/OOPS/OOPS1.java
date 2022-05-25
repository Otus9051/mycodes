import java.util.*;
public class OOPS1
{
    private String fname = "John";
    private String lname = "Doe";
    private int age = 24;

    public static void main(String args[])
    {
        OOPS1 pobj=new OOPS1();
        System.out.println("First Name: "+pobj.fname+"\nLast Name: "+pobj.lname+"\nAge: "+pobj.age);
    }
}