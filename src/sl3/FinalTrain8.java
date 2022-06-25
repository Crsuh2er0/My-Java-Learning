package sl3;

public class FinalTrain8 {
    public static void main(String args[]){
        int a = 400;
        int b = 160;
        int c = 30;
        int num = 100;
        int d = 23;
        int act = (int) (a / d) * (int) (b / d) * (int) (c / d);
        System.out.println("这辆货车满载时能装 " + act + " 个西瓜。");
        if (act > num){
            act = num;
        }
        System.out.println("这辆货车实际能装 " + act + " 个西瓜。");
    }
}
