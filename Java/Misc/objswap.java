import java.util.Scanner;
public class objswap {
    String name;
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.next();
    }
    public void show() {
        System.out.println(name);
    }
    public void swap(objswap ss) {
        String temp = name;
        name = ss.name;
        ss.name = temp;
    }
    public static void main(String args[]) {
        objswap s1 = new objswap();
        objswap s2 = new objswap();
        s1.get();
        s2.get();
        System.out.println("Before swapping:");
        s1.show();
        s2.show();
        s1.swap(s2);
        System.out.println("After swapping:");
        s1.show();
        s2.show();
    }
}
