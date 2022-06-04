public class ZeroLevel {
    int a;
    int b;
    int s;
    // Non-parameterized | Zero Level Constructor
    public ZeroLevel() {
        a = 10;
        b = a+2;
    }
    // Default Constructor
    public void display() {
        s = a+b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("sum="+s);
    }
    public static void main(String args[]) {
        ZeroLevel d = new ZeroLevel();
        d.display();
    }
}
