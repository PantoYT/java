package podstawy_programowania;

import java.util.Scanner;

public class L2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextLine();
        scanner.close();
        int out;
        if (a.equals("1")) {
            out = 0;
        } else if (a.equals("0")) {
            out = 1;
        } else {
            throw new IllegalArgumentException("Niepoprawna wartość, oczekiwano 0 lub 1");
        }
        System.out.println(out);
    }
}
