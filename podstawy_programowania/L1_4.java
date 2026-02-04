package podstawy_programowania;

import java.util.Scanner;

public class L1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextLine();
        var b = scanner.nextLine();
        var c = scanner.nextLine();
        scanner.close();
        System.out.println(a + " " + b + " " + c);
    }
}
