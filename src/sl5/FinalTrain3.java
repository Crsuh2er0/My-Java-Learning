package sl5;

import java.util.Arrays;

public class FinalTrain3 {
    public static void main(String[] args) {
        int max = 15;
        int[][] array = new int[max][0];

        //设置每行的长度
        for (int a = 0; a < max; a++) {
            array[a] = Arrays.copyOf(array[a], a + 1);
        }

        for (int a = 0; a < max; a++) {
            for (int b = 0; b <= a; b++) {
                if (b == 0 || b == a) {
                    array[a][b] = 1;
                    continue;
                }
                array[a][b] = array[a - 1][b - 1] + array[a - 1][b];
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
