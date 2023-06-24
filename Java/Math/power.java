import java.io.*;
import java.math.*;
public class power {
    public static void main(String args[]) throws IOException{
        double n1, n2, p = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        n1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the power");
        n2 = Integer.parseInt(br.readLine());
        p = Math.pow(n1, n2);
        System.out.println("The result is: " + p);
        p = Math.pow(2,3);
        System.out.println("The result is: " + p);
    }
}
