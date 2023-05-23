import java.util.Scanner;
public class CopyConstructor {
    int n1, n2, s;
    CopyConstructor(int a, int b) {
        n1 = a;
        n2 = b;
    } // Parameterized Constructor
    CopyConstructor(CopyConstructor d) {
        n1 = d.n1;
        n2 = d.n2;
    } // Copy Constructor
    public void display() {
        s = n1 + n2;
        System.out.println("The sum of 2 numbers is " + s);
    }
    public static void main(String args[]) {
        int x, y;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st number");
            x = sc.nextInt();
            System.out.println("Enter 2nd number");
            y = sc.nextInt();
        }
        CopyConstructor d = new CopyConstructor(x,y);
        CopyConstructor d1 = new CopyConstructor(d);
        d.display(); // Original constructor
        d1.display(); // Copy constructor
    }
}
