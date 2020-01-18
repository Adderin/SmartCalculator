package calculator;

import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        int[] arr = new int[strings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        int shift = scanner.nextInt();
        shift = shift % arr.length;
        int[] arrCopy = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            if (j + shift <= arr.length - 1) {
                arrCopy[j + shift] = arr[j];
            } else {
                arrCopy[j + shift - arr.length] = arr[j];
            }
        }
        for (int i : arrCopy)
            System.out.print(i + " ");
    }
}
