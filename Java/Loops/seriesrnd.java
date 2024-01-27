public class seriesrnd {
    public static void main(String[] args) {
        System.out.println("a. ");
        for (int i = 0; i < 10; i++) {
            int valueA = i * (i + 1);
            System.out.print(valueA + " ");
        }
        System.out.println();

        System.out.println("\nb. ");
        for (int i = 0; i < 10; i++) {
            int valueB = 2 + i * (i + 1);
            System.out.print(valueB + " ");
        }
        System.out.println();
    }
}
