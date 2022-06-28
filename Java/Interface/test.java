interface A {
    void getA();
}
interface B {
    void getB();
}
class test implements A, B {
    public void getA() {
        System.out.println("A");
    }
    public void getB() {
        System.out.println("B");
    }
    public static void main(String[] args) {
        test c = new test();
        c.getA();
        c.getB();
    }
}
