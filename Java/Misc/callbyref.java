import java.util.Scanner;
class student {
    int total;
    public void get() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total marks: ");
            total = sc.nextInt();
        }
    }
    public void show() {
        System.out.println("Total marks: " + total);
    }
    public void add(student ss) {
        int finaltotal = total + ss.total;
        System.out.println("Final total: " + finaltotal);
    }
    public static void main(String args[]) {
        student s1 = new student();
        student s2 = new student();
        s1.get();
        s1.show();
        s2.get();
        s2.show();
        s1.add(s2);
    }
}
