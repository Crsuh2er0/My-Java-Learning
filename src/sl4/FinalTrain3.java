package sl4;

public class FinalTrain3 {
    public static void main(String[] args) {
        int a = 1;
        double sum = 0;
        double tem = 1;
        int t = 1;
        while (a <= 20) {
            while (t <= a) {
                tem *= t;
                t++;
            }
            //System.out.println(tem);
            sum += 1 / tem;
            tem = 1;
            t = 1;
            a++;
        }
        System.out.println("1~20的阶乘的倒数之和为：" + sum);
    }
}
