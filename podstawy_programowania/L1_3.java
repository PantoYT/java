package podstawy_programowania;

import java.util.Scanner;

public class L1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextLine();
        scanner.close();
        System.out.println("Wczytana liczba to: " + a);
    }
}
