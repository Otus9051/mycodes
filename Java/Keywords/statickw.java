public class statickw {
    static int n1 = 10;
    static int n2;
    static void display() {
        System.out.println("Static keyword");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }
    static {
        n2 = n1 * 4;
    }
    public static void main(String[] args) {
        display();
    }
}
