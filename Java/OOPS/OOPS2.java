public class OOPS2
{
    public void method1()
    {
        System.out.println("Public method must be called by creating object");
    }
    static void method2()
    {
        System.out.println("Static method can be called without creating object");
    }
    public static void main(String[] args)
    {
        method2();
        OOPS2 obj = new OOPS2();
        obj.method1();
    }
}