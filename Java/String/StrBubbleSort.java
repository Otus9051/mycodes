public class StrBubbleSort {
    public static void main (String args[]) {
        String arr[] = {"Java", "Python", "C", "C++", "Ruby", "Perl"};
        String temp;
        System.out.print("Sorting Array using Bubble Sort Technique..\n");
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<(arr.length-1); j++) {
                if(arr[j].compareTo(arr[j+1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Now the Array after Sorting is :\n");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]+ "  ");
        }
    }
}