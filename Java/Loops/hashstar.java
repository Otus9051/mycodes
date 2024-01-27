public class hashstar {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}