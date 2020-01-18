package calculator;

import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        int shift = scanner.nextInt();
        shift = shift % arr.length;
        int[] arr_copy = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            if (j + shift <= arr.length - 1) {
                arr_copy[j + shift] = arr[j];
            } else {
                arr_copy[j + shift - arr.length] = arr[j];
            }
        }
        for (int i : arr_copy)
            System.out.print(i + " ");
    }
}
