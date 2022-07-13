package sl3;

public class FinalTrain7 {
    public static void main(String[] args) {
        int money = 10;
        double ypmin = 0.2;
        int usedtime = 30;
        int usedflow = 10;
        double ypmb = 0.3;
        double lasttime = (money - ypmin * usedtime - ypmb * usedflow) / ypmin;
        System.out.println("花费余额还可以通话 " + lasttime + " 分钟。");
    }
}
