// "this" keyword is used to refer the current object of a class in Java.
import java.util.Scanner;
public class thiskw {
    private int n1, n2, sum;
    public void get(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public void add() {
        sum = n1 + n2;
        System.out.println("The sum is " +sum);
    }
    public static void main(String[] args) {
        thiskw obj = new thiskw();
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x ");
        x = sc.nextInt();
        System.out.println("Enter the value of y ");
        y = sc.nextInt();
        obj.get(x, y);
        obj.add();
    }
}
