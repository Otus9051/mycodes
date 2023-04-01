import java.io.*;
public class HighestMarks {
    public static void main(String[] args) throws IOException {
        int n[][] = new int[3][5];
        int s[] = new int[3];
        int r, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (r = 0; r <= 2; r++) {
            System.out.println("Enter the marks for student " + (r + 1));
            for (c = 0; c <= 4; c++) {
                System.out.print("Enter Marks -> ");
                n[r][c] = Integer.parseInt(br.readLine());
            }
        }
        for (r = 0; r <= 2; r++) {
            s[r] = n[r][0];
            for (c = 1; c <= 4; c++) {
                if (s[r] < n[r][c]) {
                    s[r] = n[r][c];
                }
            }
        }
        for (r = 0; r <= 2; r++) {
            System.out.println("Highest Marks Details of Student " + (r + 1));
            System.out.println(s[r]);
        }
    }
}
