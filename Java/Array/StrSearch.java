import java.io.*;
public class StrSearch {
    public static void main(String args[]) {
        String ct[] = { "India", "USA", "UK", "China", "Russia" };
        String c; 
        int i, flag = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the country to be searched: ");
        try {
            c = br.readLine();
            for (i = 0; i < 5; i++) {
                if (c.equals(ct[i])) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("Country found at index " + i);
            } else {
                System.out.println("Country not found");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
