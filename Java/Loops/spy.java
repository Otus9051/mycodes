import java.util.Scanner; 

class spy { 
	public static void main(String[] args) { 
		
        Scanner sc = new Scanner(System.in);
        int p = 1, s = 0, ld; 
		System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
        int tmp = n;

		while (tmp > 0) { 
			ld = tmp % 10; 
			s = s + ld; 
			p = p * ld; 
			tmp = tmp / 10; 
		} 
		if (s == p) 
			System.out.println(n +" is spy number"); 
		else
			System.out.println(n + " is not spy number"); 
	} 
}
