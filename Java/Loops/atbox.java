public class atbox { 

	public static void main(String args[]) { 
		int i, j, n = 6; 
        for (i = 1; i <= 1; i++) { // first line
            for (j = 1; j <= n + 2; j++) {
                System.out.print("$");
            }
            System.out.println();
        }

        for (i = 2; i < n; i++) { // middle part
            System.out.print("$");
            for (j = 1; j <= n; j++) {
                System.out.print("@");
            }
            System.out.print("$");
            System.out.println();
        }

        for (i = n; i <= n; i++) { // last line
            for (j = 1; j <= n + 2; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
	} 
}

/*
Output:

   $$$$$$$$
   $@@@@@@$
   $@@@@@@$
   $@@@@@@$
   $@@@@@@$
   $$$$$$$$

*/