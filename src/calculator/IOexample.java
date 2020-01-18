package calculator;

import java.util.Scanner;

public class IOexample {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                String input = scanner.nextLine();
                if (input.equals("/exit")) {
                    System.out.println("Bye!");
                    break;
                }
            String[] str = input.split(" ");
            if (str.length <= 1) {
                System.out.println(Integer.parseInt(str[0]));
            } else {
                System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
            }
            } catch (Exception e) {
            }
        } while(true);
    }
}
