public class compositenum {
    public static void main(String[] args) {
        for (int i = 4; i <= 100; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag != 0) {
                System.out.println(i);
            }
        }
    }
}