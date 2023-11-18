import java.util.Scanner;
class swpattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.print("Enter 1 for star pattern and 2 for number pattern: ");
        ch = sc.nextInt();
        sc.close();
        switch(ch) {
            case 1:
                // 9 row, 5 column
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 6; i <= 9; i++) {
                    for (int j = 8; j >= i-1; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            case 2:
                // 9 row, 5 column
                int disp;
                for (int i = 1; i <= 5; i++) {
                    disp = 1;
                    for (int j = i; j <= 5; j++) {
                        System.out.print(disp);
                        disp++;
                    }
                    System.out.println();
                }
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= i+1; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
        }
    }
}