package sl5;

import java.util.Arrays;

import static java.util.Arrays.fill;

public class Train6 {
    public static void main(String[] args){
        int[][] boxes = new int[10][60];
        int[] fullbox = new int[60];
        int[] nonfullbox = new int[60];

        fill(fullbox,1);
        fill(nonfullbox,0,58,1);
        fill(boxes,0,4,fullbox);
        fill(boxes,4,10,nonfullbox);
        //System.out.println(Arrays.deepToString(boxes));
    }
}
