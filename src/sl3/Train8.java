package sl3;

public class Train8 {
    public static void main(String[] args) {
        int areaa = 2;
        int areab = 4;
        double boxa = 1.5;
        double boxb = 1.5;
        int maxina = (int) (areaa / boxa);
        int maxinb = (int) (areab / boxb);
        int maxperfloor = maxina * maxinb;
        System.out.println("载货区一层可以放的箱子数为：" + maxperfloor);
    }
}
