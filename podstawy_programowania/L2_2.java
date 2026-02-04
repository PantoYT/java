package podstawy_programowania;

import java.util.Scanner;

public class L2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextLine();
        var b = scanner.nextLine();
        scanner.close();
        int inta = Integer.parseInt(a);
        int intb = Integer.parseInt(b);
        double out = Math.pow(inta, intb);
        System.out.println(out);
    }
}
