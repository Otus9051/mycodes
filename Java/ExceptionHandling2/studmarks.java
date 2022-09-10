package Java.ExceptionHandling2;
import java.util.Scanner;

public class studmarks {
    private int marks;
    public studmarks(int marks) {
        this.marks = marks;
    }
    public void show() throws CustomException {
        if (marks < 0 || marks > 100) {
            throw new CustomException();
        } else {
            System.out.println("Marks: " + marks);
        }
    }
    public static void main (String args[]) {
        int tempm;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter marks");
            tempm = sc.nextInt();
        }
        studmarks sm = new studmarks(tempm);
        try {
            sm.show();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid Marks");
        }
    }
}
