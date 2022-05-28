import java.util.*;
public class Param {
    private int n1, n2, s;
    public void get(int ta, int tb) {
        n1 = ta;
        n2 = tb;
    }
    public void find_total() {
        s = n1 + n2;
    }
    public void display() {
        System.out.println("Sum of " + n1 + " and " + n2 + " is " + s);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Param obj = new Param();
        obj.get(a, b);
        obj.find_total();
        obj.display();
    }
}
