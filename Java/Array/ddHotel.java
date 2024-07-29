import java.io.*;
public class ddHotel {
	public static void main(String args[]) throws IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int i, j, k = 0;
		String name[] = new String[500];
		String m[][] = new String[10][50];
		for (i = 1; i < 500; i++) {
			System.out.println("Enter the name of the visitor: ");
			name[i] = in.readLine();
		}
		for (i = 1; i < 10; i++) {
			for (j = 0; j < 50; j++) {
				m[i][j] = name[k];
				k += 1;
			}
		}
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 50; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
}	
