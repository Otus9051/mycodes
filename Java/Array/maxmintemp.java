import java.io.*;
public class maxmintemp {
	public static void main(String args[]) throws IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int i, j;
		String day; 
		String m[][] = new String[7][3];
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Enter Day, Max Temp, Min Temp: ");
				m[i][j] = in.readLine();
			}
		}
		System.out.println("Enter a day of the week to know the temperature: ");
		day = (in.readLine());
		for (i = 0; i < 7; i++) {
			if (day.compareTo(m[i][0]) == 0) {
				System.out.println("The max temp is" +m[i][1]);
				System.out.println("The min temp is" +m[i][2]);
			}
		}
	}
}
