interface A {
    int a=1;
    void getA();
}
interface B extends A {
    void getB();
}
class test2 implements B {
    int b=2, sum;
    public void getA() {
        sum = b + A.a;
        System.out.println("A " + sum);
    }
    public void getB() {
        System.out.println("B");
    }
    public static void main(String[] args) {
        test2 c = new test2();
        c.getA();
        c.getB();
    }
}
