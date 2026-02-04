package podstawy_programowania;

import java.util.Scanner;

public class L1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var wiek = scanner.nextLine();
        var wzrost = scanner.nextLine();
        var waga = scanner.nextLine();
        scanner.close();
        System.out.println("Ile masz lat?\n" + "Masz " + wiek + " lat.\n");
        System.out.println("Jaki masz wzrost?\n" + "Masz " + wzrost + "cm.\n");
        System.out.println("Jaka jest Twoja waga?\n" + "Twoja waga to " + waga + " kg." );
    }
}