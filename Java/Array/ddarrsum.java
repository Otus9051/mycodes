import java.io.*;
public class ddarrsum {
       public static void main(String args[]) throws IOException {
       		InputStreamReader read = new InputStreamReader(System.in);
 		BufferedReader in = new BufferedReader(read);
		int i, j;
		int m[][] = new int[4][4];
		int n[][] = new int[4][4];
		int p[][] = new int[4][4];
		System.out.println("Enter the numbers of the first matrix: ");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				m[i][j] = Integer.parseInt(in.readLine());
			}
		}
		System.out.println("Enter the numbers of the second matrix: ");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				n[i][j] = Integer.parseInt(in.readLine());
			}
		}
		System.out.println("Sum of the array elements is: ");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				p[i][j] = m[i][j] + n[i][j];
				System.out.print(p[i][j] + " ");
			}
			System.out.println();
		}
	}
}
