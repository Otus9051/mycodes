public class atdoltri { 

    public static void main(String args[]) { 
        int n = 4;
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n - i - 1; j++) { 
                System.out.print(" "); 
            } 
            System.out.print("$");
            for (int k = 0; k < 2 * i; k++) { 
                System.out.print("@"); 
            } 
            System.out.println("$"); 
        } 
    } 
}