package calculator;

import java.util.Scanner;

public class MinimumValueOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
