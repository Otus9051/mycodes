public class numtriangle { 
	public static void main(String args[]) { 
		int i, j, n = 4; 
		// outer loop to handle number of rows 
		for (i = 1; i <= n; i++) { 
			// inner loop to print space 
			for (j = 1; j <= n - i; j++) { 
				System.out.print(" "); 
			} 
			for (j = 1; j <= i; j++) { 
				System.out.print(i + " "); 
			} 
			// print new line for each row 
			System.out.println(); 
		} 
	} 
}
