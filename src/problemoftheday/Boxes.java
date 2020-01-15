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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Boxes {
    static Scanner scanner = new Scanner(System.in);
    private ArrayList<Integer> arrayList;

    public static void main(String[] args) throws IndexOutOfBoundsException {
        ArrayList<Integer> box1 = new ArrayList<>();
        ArrayList<Integer> box2 = new ArrayList<>();

        box1 = takingParameters();
        Collections.sort(box1);
        box2 = takingParameters();
        Collections.sort(box2);
        for (int i = 0; i < box1.size(); i++) {

        }
        if (box1.equals(box2)) {
            System.out.println("Box 1 = Box 2");
        }

    }

    static ArrayList<Integer> takingParameters() {
        ArrayList<Integer> box = new ArrayList<>();
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        for (int i = 0; i < str.length; i++) {
            box.add(Integer.parseInt(str[i]));
        }
        return box;
    }
}
