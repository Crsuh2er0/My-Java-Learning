package sl4;

public class Train3 {
    public static void main(String[] args) {
        int num = 1;
        for (int t = 1; t <= 10; t++) {
            num *= 2;
        }
        System.out.println("第十代菌落种的细菌数量为：" + num);
    }
}
