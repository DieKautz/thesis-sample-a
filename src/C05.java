class C05 {
    public static void main(String[] args) {
        int number = 4;
        System.out.print(compute(number));
    }

    public static int compute(int number) {
        if (number <= 1) {
            return 1;
        }

        return compute(number - 2) + compute(number - 4);
    }
}

