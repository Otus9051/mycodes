import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphSortCopilot {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of students: ");
        int n = Integer.parseInt(input.readLine());
        String[] names = new String[n];

        // Taking input names from user
        System.out.println("Enter the names of students:");
        for (int i = 0; i < n; i++) {
            names[i] = input.readLine();
        }

        // Bubble Sort to sort the names in alphabetical order
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (names[j].compareToIgnoreCase(names[j+1]) > 0) {
                    // swap names[j] with names[j+1]
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }

        // Displaying the sorted names
        System.out.println("Sorted names:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}