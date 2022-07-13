package sl3;

public class Train6 {
    public static void main(String[] args) {
        double a = 21.8;
        double b = 2;
        double c = 7;
        double d = 8;
        double e = 28;
        double f = 62;
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("解得：x=" + x + " y=" + y);
    }
}
