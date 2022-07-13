package sl4;

public class Train4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int n = 53;
        int tem, num;
        for (int t = 1; t < n - 1; t++) {
            tem = a + b;
            a = b;
            b = tem;
        }
        num = b;
        System.out.println("这组数中的第n个数值为：" + num);
    }
}
