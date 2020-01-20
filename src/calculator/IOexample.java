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
                if (input.equals("/help")) {
                    System.out.println("The program calculates the sum of numbers");
                }
                String[] str = input.split(" ");
                int sum = 0;
                if (str.length <= 1) {
                    System.out.println(Integer.parseInt(str[0]));
                } else {
                    for (int i = 0; i < str.length; i++) {
                        sum += Integer.parseInt(str[i]);
                    }
                    System.out.println(sum);
                }
            } catch (Exception e) {
            }
        } while (true);
    }
}
