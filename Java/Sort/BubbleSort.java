import java.util.Scanner;
 public class BubbleSort {
    public static void main(String args[]) {
        int size, i, j, temp;
        int arr[] = new int[50];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        size = scan.nextInt();
        System.out.print("Enter Array Elements : ");
        for(i=0; i<size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Sorting Array using Bubble Sort Technique..\n");
        for(i=0; i<size; i++) {
            for(j=0; j<(size-1); j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Now the Array after Sorting is :\n");
        for(i=0; i<size; i++) {
            System.out.println(arr[i]+ "  ");
        }
    }
 }