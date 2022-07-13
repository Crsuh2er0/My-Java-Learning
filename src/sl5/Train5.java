package sl5;

import static java.util.Arrays.fill;

public class Train5 {
    public static void main(String[] args) {
        int[][] boxes = new int[10][60];
        int[] box = new int[60];
        fill(box, 0, 58, 1);
        fill(boxes, box);
        //System.out.println(Arrays.deepToString(boxes));
    }
}
