import java.util.Scanner;
class Emp {
    private int empno;
    private String ename;
    protected int salary;
    public void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Number");
        empno = sc.nextInt();
        System.out.println("Enter Employee Name");
        ename = sc.next();
        System.out.println("Enter Employee Salary");
        salary = sc.nextInt();
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + salary);
    }
}
class SalesEmp extends Emp {
    private int commision;
    private int incentive;
    private int grossSalary;
    public void getSalesDetails () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Commission");
        commision = sc.nextInt();
        System.out.println("Enter Employee Incentive");
        incentive = sc.nextInt();
    }
    public void calculateSalary() {
        grossSalary = salary + commision + incentive;
    }
    public void displaySalesDetails() {
        System.out.println("Employee Commission: " + commision);
        System.out.println("Employee Incentive: " + incentive);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Final Salary: " + grossSalary);
    }
}
public class employees {
    public static void main(String[] args) {
        SalesEmp obj = new SalesEmp();
        obj.getEmployeeDetails();
        obj.getSalesDetails();
        obj.calculateSalary();
        obj.displayEmployeeDetails();
        obj.displaySalesDetails();
    }
}