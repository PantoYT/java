package podstawy_programowania;

import java.util.Scanner;

public class L2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextLine();
        var b = scanner.nextLine();
        scanner.close();
        int inta = Integer.parseInt(a);
        int intb = Integer.parseInt(b);
        var out = inta/intb;
        System.out.println(out);
    }
}
