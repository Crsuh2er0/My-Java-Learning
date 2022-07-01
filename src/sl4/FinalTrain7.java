package sl4;

public class FinalTrain7 {
    public static void main(String[] args){
        int c = -30;
        double f;
        do {
            f = c * 9 / 5 + 32;
            System.out.println("摄氏温度：" + c + "℃" + "    " + "华氏温度：" + f + "℉");
            c += 10;
        } while (c <= 50);
    }
}
