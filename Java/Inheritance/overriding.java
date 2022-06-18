import java.util.Scanner;
class Applicant {
    String applicantName;
    String applicantAddress;
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Applicant Name");
        applicantName = sc.next();
        System.out.println("Enter Applicant Address");
        applicantAddress = sc.next();
    }
    public void display() {
        System.out.println("Applicant Name: " + applicantName);
        System.out.println("Applicant Address: " + applicantAddress);
    }
}
class Candidate extends Applicant {
    String post;
    int Salary;
    public void get() {
        super.get();
        Salary = 10000;
        post = "Software Engineer";
    }
    public void display() {
        super.display();
        System.out.println("Post: " + post);
        System.out.println("Salary: " + Salary);
    }
}
public class overriding {
    public static void main(String[] args) {
        Candidate obj = new Candidate();
        obj.get();
        obj.display();
    }
}