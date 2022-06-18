class n1 {
    static int a = 10;
    static int b = 20;
    static void callme() {
        System.out.println("a = " + a);
    }
}
class statickwclass {
    public static void main(String[] args) {
        n1.callme();
        System.out.println("b = "+ n1.b);
    }
}
