package podstawy_programowania;

import java.util.Scanner;

public class L2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var podstawa1 = scanner.nextLine();
        var podstawa2 = scanner.nextLine();
        var wysokosc = scanner.nextLine();
        scanner.close();
        float a = Float.parseFloat(podstawa1);
        float b = Float.parseFloat(podstawa2);
        float h = Float.parseFloat(wysokosc);
        var ab = a + b;
        var p = ab * h;
        var out = p/2;
        System.out.println(out);
    }
}
