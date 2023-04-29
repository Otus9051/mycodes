import java.io.*;
public class AlphSort {
    public static void main(String args[]) throws IOException {
        String arr[] = new String[10];
        int stdc, i, j;
        String tmp;
        System.out.println("How many students do you want to enter? ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        stdc = Integer.parseInt(br.readLine());
        for (i = 0; i < stdc; i++) {
            System.out.println("Enter the name of the Students: ");
            arr[i] = br.readLine();
        }
        for (i = 0; i < stdc; i++) {
            System.out.println(arr[i]);
        }
        for (i = 0; i < stdc; i++) {
            for (j = i+1; j < stdc; j++) {
                if (arr[i].compareTo(arr[j]) > 0){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (i = 0; i < stdc; i++) {
            System.out.println(arr[i]);
        }
    }
}