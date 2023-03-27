import java.util.Scanner;
public class ArrayDel {
    public static void main(String args[]) {
        int a1[] = new int[10];
        int i, ri;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (i = 0; i < 10; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter the index to be deleted");
        ri = sc.nextInt();
        for (i = ri; i < 9; i++) {
            a1[i] = a1[i + 1];
        }
        System.out.println("The new array is");
        for (i = 0; i < 9; i++) {
            System.out.println(a1[i]);
        }

    }
}