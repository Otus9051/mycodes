public class FreqCheck {
    public static void main(String args[]) {
        int n[] = { 1, 2, 3, 2, 5, 3, 4 };
        int freq;
        int i, j;
        for (i = 0; i < 7; i++) {
            freq = 1;
            for (j = i + 1; j < 7; j++) {
                if (n[i] == n[j]) {
                    freq++;
                }
            }
            System.out.println("Frequency of " + n[i] + " is " + freq);
        }
    }
}
