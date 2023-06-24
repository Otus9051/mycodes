import java.util.Scanner;
class Student {
    int roll, total;
    String name;

    public void get (int roll, String name, int total) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll: ");
        roll = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter total: ");
        total = sc.nextInt();
        scanner.close();
    }

    public void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        for (int i = 0; i < 5; i++) {
            s[i] = new Student();
            s[i].get();
            s[i].show();
        }
    }
}