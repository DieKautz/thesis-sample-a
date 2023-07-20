class C03 {
    public static void main(String[] args) {
        int number = 13;
        System.out.print(compute(number));
    }

    public static boolean compute(int number) {
        if (number < 5) {
            return false;
        } else {
            return true;
        }
    }
}
