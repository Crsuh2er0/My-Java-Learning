package sl5;

public class FinalTrain1 {
    public static void main(String[] args) {
        int[][] num = new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        boolean same = true;
        int[] sum = new int[8];
        sum[0] = num[0][0] + num[1][0] + num[2][0];
        sum[1] = num[0][1] + num[1][1] + num[2][1];
        sum[2] = num[0][2] + num[1][2] + num[2][2];
        sum[3] = num[0][0] + num[0][1] + num[0][2];
        sum[4] = num[1][0] + num[1][1] + num[1][2];
        sum[5] = num[2][0] + num[2][1] + num[2][2];
        sum[6] = num[0][0] + num[1][1] + num[2][2];
        sum[7] = num[0][2] + num[1][1] + num[2][0];
        int temp = sum[0];
        for (int a : sum) {
            if (a != temp) {
                same = false;
                break;
            }
        }
        System.out.println(same);
    }
}
