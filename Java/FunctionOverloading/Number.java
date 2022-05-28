import java.util.*;
class Number {
    private int n1, n2, n3;
    private int sum;
    public void add(int ta, int tb) {
        n1 = ta;
        n2 = tb;
        sum = n1 + n2;
        System.out.println("The sum of 2 numbers is " + sum);
    }
    public void add(int ta, int tb, int tc) {
        n1 = ta;
        n2 = tb;
        n3 = tc;
        sum = n1 + n2 + n3;
        System.out.println("The sum of 3 numbers is " + sum);
    }
    public static void main(String args[]) {
        int a, b, c;
        int ch;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Press 1 to Add 2 numbers, Press 2 to Add 3 numbers and 3 to exit");
            System.out.println("Enter your Choice");
            ch = sc.nextInt();
            Number num = new Number();
            switch(ch) {
                case 1:
                    System.out.println("Enter 2 numbers");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    num.add(a, b);
                    break;
                case 2:
                    System.out.println("Enter 3 numbers");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    c = sc.nextInt();
                    num.add(a, b, c);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
