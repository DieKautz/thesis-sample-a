class C06 {
    public static void main(String[] args) {
        int input = 4;
        System.out.print(compute(input));
    }

    public static int compute(int value) {
        if (value == 1) {
            return 1;
        }

        return compute(value - 1) * value;
    }
}
