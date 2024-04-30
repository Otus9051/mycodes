public class randChar {
    public static void main(String[] args) {
        char ch;
        int n;
        System.out.println("Random character: ");
        for (int i = 0; i < 10; i++) {
            n = (int)(Math.random() * 26) + 97; // 65 for uppercase
            ch = (char)n;
            System.out.print(ch + " ");
        }
    }
}