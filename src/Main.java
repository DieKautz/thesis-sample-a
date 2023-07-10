import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

@SuppressWarnings("DataFlowIssue")
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
        String string;
        int x, y, z;
        double u, v;

        // C01
        System.out.println("Do you want to begin?");
        string = scanner.nextLine();
        if (!C01.compute(string)) exit(1);

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
    }
}
