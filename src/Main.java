import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

@SuppressWarnings("ALL")
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            promptUser();
        } catch (Exception e) {
            System.err.println("Wrong input for given function!");
        }
    }

    private static void promptUser() {
        String string1, string2;
        int u, v, w, x, y, z;

        // C01
        System.out.println("Do you want to begin?");
        string1 = scanner.nextLine();
        if (!C01.compute(string1)) exit(1);

        // C02
        System.out.println("Integer 1:");
        x = scanner.nextInt();
        System.out.println("Integer 2:");
        y = scanner.nextInt();
        System.out.println("Integer 3:");
        z = scanner.nextInt();
        System.out.println(C02.compute(new int[]{x, y, z}));

        // C03
        System.out.println("Integer:");
        x = scanner.nextInt();
        System.out.println(C03.compute(x));

        // C04
        System.out.println("Integer 1:");
        x = scanner.nextInt();
        System.out.println("Integer 2:");
        y = scanner.nextInt();
        System.out.println(C04.compute(x, y));

        // C05
        System.out.println("Integer:");
        x = scanner.nextInt();
        System.out.println(C05.compute(x));

        // C06
        System.out.println("Integer:");
        x = scanner.nextInt();
        System.out.println(C06.compute(x));

        // C07
        System.out.println("Integer:");
        x = scanner.nextInt();
        System.out.println(C07.compute(x));

        // C07
        System.out.println("Integer:");
        x = scanner.nextInt();
        System.out.println(C07.compute(x));

        // C08
        System.out.println("String:");
        string1 = scanner.nextLine();
        System.out.println("Integer:");
        x = scanner.nextInt();
        System.out.println(C08.compute(string1, x));

        // C09
        System.out.println("String:");
        string1 = scanner.nextLine();
        System.out.println(C09.compute(string1));

        // C10
        System.out.println("String:");
        string1 = scanner.nextLine();
        System.out.println(C10.compute(string1));

        // C11
        System.out.println("Integer:");
        x = scanner.nextInt();
        System.out.println(C11.compute(x));

        // C12
        System.out.println("Integer 1:");
        v = scanner.nextInt();
        System.out.println("Integer 2:");
        w = scanner.nextInt();
        System.out.println("Integer 3:");
        x = scanner.nextInt();
        System.out.println("Integer 4:");
        y = scanner.nextInt();
        System.out.println("Integer 5:");
        z = scanner.nextInt();
        System.out.println(C12.compute(new int[]{v, w, x, y, z}));

        // C13
        System.out.println("Integer 1:");
        x = scanner.nextInt();
        System.out.println("Integer 2:");
        y = scanner.nextInt();
        System.out.println(C13.compute(x, y));

        // C14
        System.out.println("Integer 1:");
        w = scanner.nextInt();
        System.out.println("Integer 2:");
        x = scanner.nextInt();
        System.out.println("Integer 3:");
        y = scanner.nextInt();
        System.out.println("Integer 4:");
        z = scanner.nextInt();
        System.out.println(Arrays.toString(C14.compute(w, x, y, z)));

        // C15
        System.out.println("String:");
        string1 = scanner.nextLine();
        System.out.println(C15.compute(string1));

        // C16
        System.out.println("String 1:");
        string1 = scanner.nextLine();
        System.out.println("String 2:");
        string2 = scanner.nextLine();
        System.out.println(C16.compute(string1, string2));

        // C17
        System.out.println("Integer 1:");
        x = scanner.nextInt();
        System.out.println("Integer 2:");
        y = scanner.nextInt();
        System.out.println("Integer 3:");
        z = scanner.nextInt();
        System.out.println(C17.compute(new int[]{x, y, z}));
    }
}
