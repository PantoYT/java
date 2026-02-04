package podstawy_programowania;

import java.util.Scanner;

public class L2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextLine();
        scanner.close();
        int n = Integer.parseInt(a);
        var o=n*2;
        System.out.println(o);
    }
}
