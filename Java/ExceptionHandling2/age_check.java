package Java.ExceptionHandling2;
import java.util.Scanner;

public class age_check {
    public static void main(String[] args) {
        int age;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age");
            age = sc.nextInt();
        }
        try {
            if (age < 6) {
                throw new CustomException();
            } else {
                System.out.println("You are eligible");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid user age");
        }
    }
}
