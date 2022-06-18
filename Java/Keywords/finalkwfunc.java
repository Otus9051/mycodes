class finalkwfuncSuper {
    final void display() {
        System.out.println("Hello World");
    }
}
class finalkwfunc extends finalkwfuncSuper {
    void display() {
        System.out.println("Hello");
    }
    public static void main(String args[]) {
        finalkwfunc obj = new finalkwfunc();
        obj.display();
    }
}