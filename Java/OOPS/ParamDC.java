import java.util.*;
class Addition  {
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
}

class Subtraction {
    private int n1, n2, s;
    public void get(int ta, int tb) {
        n1 = ta;
        n2 = tb;
    }
    public void find_subtract() {
        s = n1 - n2;
    }
    public void display() {
        System.out.println("Difference of " + n1 + " and " + n2 + " is " + s);
    }
}

public class ParamDC {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            while(true) {
                System.out.println("Press 1 for Addition and 2 for Subtraction and 3 to exit");
                int choice = sc.nextInt();
                switch (choice) {
                     case 1:
                        Addition obj = new Addition();
                        obj.get(a, b);
                        obj.find_total();
                        obj.display();
                        break;
                    case 2:
                        Subtraction obj1 = new Subtraction();
                        obj1.get(a, b);
                        obj1.find_subtract();
                        obj1.display();
                        break;
                     case 3:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        }
    }
}