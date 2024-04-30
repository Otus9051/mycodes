class boxing {
    public static void main(String args[]) {
        int x = 25, y;
        Integer i = new Integer(x); // boxing
        y = i; // unboxing
        System.out.println("x = " + x + " y = " + y);
    }
}