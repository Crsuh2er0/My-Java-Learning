package sl4;

public class Train6 {
    public static void main(String[] args) {
        int line = 4;
        int seat = 10;
        for (int a = 1; a <= line; a++) {
            for (int b = 1; b <= seat; b++) {
                if (b == 1 || b == 10) {
                    continue;
                }
                System.out.println("(" + a + "," + b + ")");
            }
        }
    }
}
