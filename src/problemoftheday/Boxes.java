/*
There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has a size of X2 x Y2 x Z2.
You need to determine which box can be put inside another box. You can rotate both boxes as you want.

        Input contains two lines.
        The first line contains numbers X1, Y1, Z1, the second line contains numbers X2, Y2, Z2.
        All numbers are integers and greater than 0.

        If the sizes of the boxes are equal, output "Box 1 = Box 2".
        If the first box can be put inside the second box, output "Box 1 < Box 2".
        If the second box can be put inside the first box, output "Box 1 > Box 2".
        If none of the boxes can be put inside the other box, output "Incomparable".

Sample Input 1:
1 1 1
2 2 2

Sample Output 1:
Box 1 < Box 2

Sample Input 2:
2 2 2
1 2 2

Sample Output 2:
Box 1 > Box 2

Sample Input 3:
1 2 3
2 3 1

Sample Output 3:
Box 1 = Box 2

Sample Input 4:
2 3 4
1 3 5

Sample Output 4:
Incomparable
*/

package problemoftheday;

import java.util.Arrays;
import java.util.Scanner;

public class Boxes {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] box1 = takingParameters();
        int[] box2 = takingParameters();
        Arrays.sort(box1);
        Arrays.sort(box2);

        if (box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]) {
            if (box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2]) {
                System.out.println("Box 1 = Box 2");
                return;
            }
            System.out.println("Box 1 > Box 2");
        } else if (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }

    static int[] takingParameters() {
        int[] newarr = new int[3];
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        for (int i = 0; i < str.length; i++) {
            newarr[i] = Integer.parseInt(str[i]);
        }
        return newarr;
    }
}
