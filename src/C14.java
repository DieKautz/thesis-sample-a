import java.util.Arrays;

class C14 {
    public static void main(String[] args) {
        int a = 9;
        int b = 12;
        int c = 8;
        int d = 11;
        System.out.print(Arrays.toString(compute(a, b, c, d)));
    }

    public static int[] compute(int a, int b, int c, int d) {
        if (a > b) { int temp = b; b = a; a = temp; }
        if (c > d) { int temp = d; d = c; c = temp; }
        if (a > c) { int temp = c; c = a; a = temp; }
        if (b > d) { int temp = d; d = b; b = temp; }
        if (b > c) { int temp = c; c = b; b = temp; }

        return new int[]{a, b, c, d};
    }
}
