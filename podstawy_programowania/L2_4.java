package podstawy_programowania;

import java.util.Scanner;

public class L2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextLine();
        scanner.close();
        int inta = Integer.parseInt(a);
        var out = Math.pow(inta, 0.5);
        System.out.println(out);
    }
} 