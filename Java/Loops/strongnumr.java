public class strongnumr {
    public static void main(String[] args) {
        int num, i, n, rem, factSum;
        for (num = 1; num <= 1000; num++) {
            n = num;
            factSum = 0;
            while (n != 0) {
                rem = n % 10;
                int fact = 1;
                for (i = 1; i <= rem; i++) {
                    fact *= i;
                }
                factSum += fact;
                n /= 10;
            }
            if (factSum == num) {
                System.out.println(num + " is a Strong number");
            }
        }
    }
}
