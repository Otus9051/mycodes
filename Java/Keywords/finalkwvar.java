// Intentionally broken. Final keyword makes the variable content static.
public class finalkwvar {
    public static void main(String args[]) {
        final int x;
        x = 10;
        System.out.println(x);
        x = x+10;
        System.out.println(x);
    }
}
