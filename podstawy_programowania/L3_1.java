package podstawy_programowania;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();
        
        int min = numbers.get(0);
        for (int n : numbers) {
            if (n < min) {
                min=n;
            }
        }
        
        System.out.println(min);
    }
}
