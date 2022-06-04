import java.util.Scanner;
public class Parameterized {
    int n1, n2, s;
    Parameterized(int a, int b) {
        n1 = a;
        n2 = b;
    } // Parameterized Constructor
    public void display() {
        s = n1 + n2;
        System.out.println("The sum of 2 numbers is " + s);
    }
    public static void main(String args[]) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        x = sc.nextInt();
        System.out.println("Enter 2nd number");
        y = sc.nextInt();
        Parameterized d = new Parameterized(x,y);
        d.display();
    }
}
