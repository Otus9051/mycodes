class A {
    public void disp1() {
        System.out.println("Function in Superclass");
    }
}
class B extends A {
    public void disp2() {
        System.out.println("Function in Subclass");
    }
}
public class extend {
    public static void main(String[] args) {
        B obj = new B();
        obj.disp1();
        obj.disp2();
    }
}