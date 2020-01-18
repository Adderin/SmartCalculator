package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumPairwiseProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        if (arr.length == 1) {
            System.out.println(arr[0]);
        } else {
            int output = arr[arr.length - 1] * arr[arr.length - 2];
            System.out.println(output);
        }
    }
}