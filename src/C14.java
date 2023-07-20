public class C14 {
    public static int[] compute(int a, int b, int c, int d) {
        if (a > b) { int temp = b; b = a; a = temp; }
        if (c > d) { int temp = d; d = c; c = temp; }
        if (a > c) { int temp = c; c = a; a = temp; }
        if (b > d) { int temp = d; d = b; b = temp; }
        if (b > c) { int temp = c; c = b; b = temp; }

        return new int[]{a, b, c, d};
    }
}
