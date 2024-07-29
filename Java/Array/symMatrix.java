import java.util.Scanner;
public class symMatrix {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i, j, k = 0;
		int m[][] = new int[3][3];
		int n[][] = new int[3][3];
		System.out.println("Enter the numbers of the matrix: ");
		for(i = 0; i < 3; i++) {
			for (j = 0; i < 3; j++) {
				m[i][j] = in.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if(m[i][j] != m[j][i]) {
					k = 1;
				}
			}
		}
		if (k == 0) 
			System.out.println("Symmetric");
		else
			System.out.println("Assymetric");
	}
}
