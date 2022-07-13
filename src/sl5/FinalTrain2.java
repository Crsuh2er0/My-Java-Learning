package sl5;

import java.util.Arrays;

public class FinalTrain2 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {91, 25, 8},
                {56, 14, 2},
                {47, 3, 67}
        };
        int[] temp1 = array[0];
        int[] temp2 = new int[3];

        array[0] = array[1];
        array[1] = array[2];
        array[2] = temp1;
        System.out.println(Arrays.deepToString(array));

        temp2[0] = array[0][0];
        temp2[1] = array[1][0];
        temp2[2] = array[2][0];
        array[0][0] = array[0][1];
        array[1][0] = array[1][1];
        array[2][0] = array[2][1];
        array[0][1] = array[0][2];
        array[1][1] = array[1][2];
        array[2][1] = array[2][2];
        array[0][2] = temp2[0];
        array[1][2] = temp2[1];
        array[2][2] = temp2[2];
        System.out.println(Arrays.deepToString(array));
    }
}
